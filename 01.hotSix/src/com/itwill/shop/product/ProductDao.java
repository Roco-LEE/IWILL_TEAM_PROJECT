package com.itwill.shop.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.common.DataSource;


public class ProductDao {

	private DataSource dataSource;
	public ProductDao() throws Exception {
		dataSource = new DataSource();
		}
/*
 * selectAll
 */
	public List<Product> findAll() throws Exception{
		List<Product> productList=new ArrayList<Product>();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Product product=new Product(
							rs.getInt("product_no"),
							rs.getDate("product_start_date"),
							rs.getString("product_category"),
							rs.getString("product_name"),
							rs.getInt("product_price"),
							rs.getString("product_detail"),
							rs.getString("product_image"),
							rs.getInt("product_read_count"),
							rs.getInt("product_seatLeft_count"));
			productList.add(product);
		}
		return productList;
	}
							
	
	/*
	 * selectByPk
	 */
	
	public Product findByPrimaryKey(int product_no) throws Exception{
		Product product = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_SELECT_BY_NO);
		pstmt.setInt(1, product_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			 		product = new Product(rs.getInt("product_no"),
			 							  rs.getDate("product_start_date"),
							              rs.getString("product_category"),
							              rs.getString("product_name"),
							              rs.getInt("product_price"),
							              rs.getString("product_detail"),
							              rs.getString("product_image"),
							              rs.getInt("product_read_count"),
							              rs.getInt("product_seatLeft_count"));
		}
		
		return product;
	}
	
	
	/*
	 * selectByKeyword
	 */
	
	public List<Product> findByKeyword(String product_name) throws Exception{
		List<Product> productList = new ArrayList<Product>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_SELECT_BY_NAME);
		pstmt.setString(1, product_name);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			 	Product product = new Product(rs.getInt("product_no"),
							              rs.getDate("product_start_date"),
				                          rs.getString("product_category"),
				                          rs.getString("product_name"),
				                          rs.getInt("product_price"),
				                          rs.getString("product_detail"),
				                          rs.getString("product_image"),
				                          rs.getInt("product_read_count"),
				                          rs.getInt("product_seatLeft_count"));
			 	productList.add(product);
		}
		
		return productList;
		
	}
	
	/*
	 * selectByCategory
	 */

	public List<Product> findByCategory(String product_category) throws Exception{
		List<Product> productList = new ArrayList<Product>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_SELECT_BY_CATEGORY);
		pstmt.setString(1, product_category);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			 		Product product = new Product(rs.getInt("product_no"),
							  			  rs.getDate("product_start_date"),
							  			  rs.getString("product_category"),
							  			  rs.getString("product_name"),
							  			  rs.getInt("product_price"),
							  			  rs.getString("product_detail"),
							  			  rs.getString("product_image"),
							  			  rs.getInt("product_read_count"),
							  			rs.getInt("product_seatLeft_count"));
			 				productList.add(product);
		}
		
		return productList;
		
	}

	
	/*
	 * updateByReadCount
	 */

	public int updateByReadCount(int product_no) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;

		int readCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(ProductSQL.PRODUCT_UPDATE_READ_COUNT);
			pstmt.setInt(1, product_no);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return readCount;
	}
	   /*
	    * selectByMaxReadCount
	    */
	   public Product selectByMaxReadCount() throws Exception{
	      Product product=null;
	      Connection con=dataSource.getConnection();
	      PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_SELECT_MAX_READ_COUNT);
	      ResultSet rs=pstmt.executeQuery();
	      if(rs.next()) {
	          product = new Product(rs.getInt("product_no"),
	                           rs.getDate("product_start_date"),
	                             rs.getString("product_category"),
	                             rs.getString("product_name"),
	                             rs.getInt("product_price"),
	                             rs.getString("product_detail"),
	                             rs.getString("product_image"),
	                             rs.getInt("product_read_count"),
	                             rs.getInt("product_seatLeft_count"));
	}

	return product;
	}

	   /*
	    * updateBySeatLeftCount
	    */
	   public int updateBySeatLeftCount(int product_no) throws Exception {
		   Connection con = null;
		   PreparedStatement pstmt = null;
		   
		   int seatLeftCount=0;
		   try {
			   con=dataSource.getConnection();
			   pstmt=con.prepareStatement(ProductSQL.PRODUCT_UPDATE_SEATLEFT_COUNT);
			   pstmt.setInt(1, product_no);
			   pstmt.executeUpdate();
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
		   return seatLeftCount;
	   }
}