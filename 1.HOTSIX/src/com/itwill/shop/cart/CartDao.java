package com.itwill.shop.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.common.DataSource;
import com.itwill.shop.product.Product;
import com.itwill.shop.userinfo.User;

public class CartDao {
	private DataSource dataSource;
	
	public CartDao() throws Exception {
		dataSource=new DataSource();
	}
	
	//insert
	public int insert(Cart cart) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int insertRowCount=0;	
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_INSERT);
			pstmt.setInt(1, cart.getCart_qty());
			pstmt.setString(2, cart.getUser_id());
			pstmt.setInt(3, cart.getProduct().getProduct_no());
			insertRowCount=pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return insertRowCount;
	}
	
	//update
	//카트리스트 수정
	public int updateByCartNo(int cart_no,int cart_qty) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_UPDATE_BY_CARTNO);
			pstmt.setInt(1, cart_qty);
			pstmt.setInt(2, cart_no);
			rowCount=pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return rowCount;
	}
	
	//카트 수량 증가		
	public int updateQtyUp(int cart_no) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;	
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_UPDATE_QTY_UP);
			pstmt.setInt(1, cart_no);
			rowCount=pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return rowCount;
	}
	//카트 수량 감소
	public int updateQtyDown(int cart_no) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;	
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_UPDATE_QTY_DOWN);
			pstmt.setInt(1, cart_no);
			rowCount=pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return rowCount;
	}
	
	//select
	//user_id
	public List<Cart> findByUserId(String user_id) throws Exception {
		List<Cart> cartList=new ArrayList<Cart>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_SELECT_BY_USERID);
			pstmt.setString(1, user_id);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				cartList.add(new Cart(rs.getInt("cart_no"),
										rs.getInt("cart_qty"),
										rs.getString("user_id"),
										new Product(rs.getInt("product_no"),
													rs.getDate("product_start_date"),
													rs.getString("product_category"),
													rs.getString("product_name"),
													rs.getInt("product_price"),
													rs.getString("product_detail"),
													rs.getString("product_image"),
													rs.getInt("product_read_count"),0)
						)
					);
			}
	}finally {
		if(con!=null) {
			con.close();
		}
	}
	return cartList;
	}
	
	//select
	//cart_no
	public Cart findByCartNo(int cart_no) throws Exception {
		Cart cart=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_SELECT_BY_CART_NO);
			pstmt.setInt(1, cart_no);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				cart=new Cart(rs.getInt("cart_no"),
						rs.getInt("cart_qty"),
						rs.getString("user_id"),
						new Product(rs.getInt("product_no"),
									rs.getDate("product_start_date"),
									rs.getString("product_category"),
									rs.getString("product_name"),
									rs.getInt("product_price"),
									rs.getString("product_detail"),
									rs.getString("product_image"),
									rs.getInt("product_read_count"),0)
						);
	
			}
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return cart;
	}
	
	//delete
	//cart_no
	public int deleteByCartNo(int cart_no) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int deleteRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_DELETE_BY_CART_NO);
			pstmt.setInt(1, cart_no);
			deleteRowCount=pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return deleteRowCount;
	}
	
	//delete
	//user_id
	public int deleteByCartUserId(String user_id) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int deleteRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_DELETE_BY_USERID);
			pstmt.setString(1, user_id);
			deleteRowCount=pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return deleteRowCount;
	}
	
	
	
	
	
}
