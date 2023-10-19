package com.itwill.shop.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.common.DataSource;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductDao;

public class OrderDao {
	private DataSource dataSource;
	public OrderDao() throws Exception {
		dataSource = new DataSource();
	}
	
	//주문 생성
	public int insert(Order order) throws Exception {
		Connection con = dataSource.getConnection();
		int insertRowCount;
//		try {
		PreparedStatement pstmt1 = con.prepareStatement(OrderSQL.ORDER_INSERT);
		pstmt1.setString(1, order.getOrderName());
		pstmt1.setString(2, order.getOrderPhone());
		pstmt1.setInt(3, order.getOrderPrice());
		pstmt1.setString(4, order.getUserId());
		insertRowCount = pstmt1.executeUpdate();
		
		PreparedStatement pstmt2 = con.prepareStatement(OrderSQL.ORDERITEM_INSERT);
		for(OrderItem orderItem : order.getOrderItemList()) {
			pstmt2.setInt(1, orderItem.getOiQty());
			pstmt2.setInt(2, orderItem.getProduct().getProduct_no());
			pstmt2.executeUpdate();
		}
//		con.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			con.rollback();
//			throw e;
//		} finally {
//			if(con != null) con.close();
//		}
		return insertRowCount;
	}
	
	public int deleteByUserId(String selectUserId) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount;
		try {
			con=dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(OrderSQL.ORDER_DELETE_BY_USERID);
			pstmt.setString(1, selectUserId);
			rowCount = pstmt.executeUpdate();
			con.commit();
		}catch (Exception e) {
			con.rollback();
			e.printStackTrace();
			throw e;
		}finally {
			if(con!=null)con.close();
		}
		return rowCount;
	}
	
	public ArrayList<Order> findByUserId(String selectUserId) throws Exception{
		ArrayList<Order> orderList=new ArrayList<Order>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<OrderItem> orderItemList = new ArrayList<OrderItem>();
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(OrderSQL.ORDER_SELECT_BY_USERID);
			pstmt.setString(1,selectUserId);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				orderItemList.add(new OrderItem(rs.getInt("oi_no"), rs.getInt("oi_qty"),
						new Product(rs.getInt("product_no"),
								rs.getDate("product_start_date"),
								rs.getString("product_category"),
								rs.getString("product_name"),
								rs.getInt("product_price"),
								rs.getString("product_detail"),
								rs.getString("product_image"),
								rs.getInt("product_read_count"),
								0), rs.getInt("order_no")));
				orderList.add(new Order(rs.getInt("order_no"),
						rs.getString("order_name"),
				       rs.getString("order_phone"),
				       rs.getInt("order_price"),
				       rs.getDate("order_date"),
				       rs.getString("user_id"),
				       orderItemList));
			}
		}finally {
			if(con != null) {
				con.close();
			}
		}
		return orderList;
	}
	
	public ArrayList<OrderItem> orderItemList(String selectUserId) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<OrderItem> orderItemList = new ArrayList<OrderItem>();
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(OrderSQL.ORDER_SELECT_BY_USERID);
			pstmt.setString(1,selectUserId);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				orderItemList.add(new OrderItem(rs.getInt("oi_no"), rs.getInt("oi_qty"),
						new Product(rs.getInt("product_no"),
								rs.getDate("product_start_date"),
								rs.getString("product_category"),
								rs.getString("product_name"),
								rs.getInt("product_price"),
								rs.getString("product_detail"),
								rs.getString("product_image"),
								rs.getInt("product_read_count"),
								0), rs.getInt("order_no")));
			}
		}finally {
			if(con != null) {
				con.close();
			}
		}
		return orderItemList;
	}
	
	
		
	
}
