package com.itwill.shop.userinfo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.itwill.shop.common.DataSource;


public class UserDao {

	private DataSource dataSource;
	public UserDao() throws Exception {
		dataSource = new DataSource();
	}
	/*
	 * insert(회원가입 회원)
	 */
	public int insert(User newuser) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_INSERT);
		pstmt.setString(1,newuser.getUserId());
		pstmt.setString(2,newuser.getUserPw());
		pstmt.setString(3,newuser.getUserPwCheck());
		pstmt.setString(4,newuser.getUserName());
		pstmt.setString(5,newuser.getUserEmail());
		pstmt.setString(6,newuser.getUserEmailSend());
		pstmt.setString(7,newuser.getUserJumin());
		pstmt.setString(8,newuser.getUserPhone());
		pstmt.setString(9,newuser.getUserGender());
		int insertRowCount=pstmt.executeUpdate();
		return insertRowCount;
		
	}
	/*
	 * 비회원은 바로 db에 이름과 번호만 저장되게,,
	 */
	
	public int insert1(User nonuser) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_INSERT);
		pstmt.setString(1,"dummy");
		pstmt.setString(2,null);
		pstmt.setString(3,null);
		pstmt.setString(4,nonuser.getUserName());
		pstmt.setString(5,null);
		pstmt.setString(6,null);
		pstmt.setString(7,null);
		pstmt.setString(8,nonuser.getUserPhone());
		pstmt.setString(9,null);
		int insertRowCount=pstmt.executeUpdate();
		return insertRowCount;
	}
	/***********************************************************************/
	public int insert1(String name,String phone) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_INSERT);
		pstmt.setString(1,"dummy");
		pstmt.setString(2,null);
		pstmt.setString(3,null);
		pstmt.setString(4,name);
		pstmt.setString(5,null);
		pstmt.setString(6,null);
		pstmt.setString(7,null);
		pstmt.setString(8,phone);
		pstmt.setString(9,null);
		int insertRowCount=pstmt.executeUpdate();
		System.out.println(insertRowCount);
		return insertRowCount;
	}
	
	/***************************************************************************/
	/*
	 * update(회원)
	 */
	public int update(User updateUser) throws Exception {
			Connection con=dataSource.getConnection();
			PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_UPDATE);
			pstmt.setString(1,updateUser.getUserPw());
			pstmt.setString(2, updateUser.getUserPwCheck());
			pstmt.setString(3,updateUser.getUserName());
			pstmt.setString(4,updateUser.getUserEmail());
			pstmt.setString(5, updateUser.getUserEmailSend());
			pstmt.setString(6, updateUser.getUserPhone());
			pstmt.setString(7,updateUser.getUserId());
			int updateRowCount=pstmt.executeUpdate();
			return updateRowCount;
			
		}
	
	/*
	 * update(비회원으로)
	 */
	public int update1(User updateUser) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_UPDATE);
		pstmt.setString(1,null);
		pstmt.setString(2, null);
		pstmt.setString(3,updateUser.getUserName());
		pstmt.setString(4,null);
		pstmt.setString(5, null);
		pstmt.setString(6, updateUser.getUserPhone());
		pstmt.setString(7,"dummy");
		int updateRowCount=pstmt.executeUpdate();
		return updateRowCount;
		
	}
	
	
	
	
	
	
	
	
	/*
	 * delete
	 */
	
	
	public int delete(String user_id) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_DELETE);
		pstmt.setString(1, user_id);
		int deleteRowCount=pstmt.executeUpdate();
		return deleteRowCount;
	}
	
	
		/*
		 * select (회원가입한 회원들에 한정 메소드)
		 */
	public User findByUserId(String user_id)throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_SELECT_BY_ID);
		pstmt.setString(1,user_id);
		ResultSet rs=pstmt.executeQuery();
		
		User findUser=null;
		if(rs.next()) {
			findUser=new User( 
						rs.getString("user_id"),
						rs.getString("user_pw"),
						rs.getString("user_pw_check"),
						rs.getString("user_name"),
						rs.getString("user_email"),
						rs.getString("user_email_send"),
						rs.getString("user_jumin"),
						rs.getString("user_phone"),
						rs.getString("user_gender")
						
					);
		}
		return findUser;
	}
	
	
	  /*
	   * selectAll
	   */
	public ArrayList<User> findAll() throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		ArrayList<User> userList=new ArrayList<User>();
		while(rs.next()) {
			userList.add(new User(
					rs.getString("user_id"),
					rs.getString("user_pw"),
					rs.getString("user_pw"),
					rs.getString("user_pw_check"),
					rs.getString("user_name"),
					rs.getString("user_email"),
					rs.getString("user_email_send"),
					rs.getString("user_jumin"),
					rs.getString("user_gender"))
					 );
		}
		return userList;
	}
	
	public int countByUserId(String userId) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_SELECT_BY_NO_COUNT);
		pstmt.setString(1, userId);
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		int userCount = rs.getInt(1);
		return userCount;
		
	}
	
	
	
	/*
	 * 전화번호로 아이디 비번 알아내기
	 */
	 public User getUserByPhone(String userPhone) throws Exception {
	        String query = "SELECT user_id, user_pw FROM userinfo WHERE user_phone = ?";
	        try (Connection conn = dataSource.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(query)) {
	            pstmt.setString(1, userPhone);
	            try (ResultSet rs = pstmt.executeQuery()) {
	                if (rs.next()) {
	                	String id=rs.getString("user_id");
						String password=rs.getString("user_pw");
					
	                	return new User(id, password);

	                    
	                } else {
	                    return null; // 회원 정보가 없으면 null 반환
	                }
	            }
	        }
	    }
}