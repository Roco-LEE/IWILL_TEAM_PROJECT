package com.itwill.shop.userinfo;

public class UserSQL {
	
	public static final String  USER_INSERT=
		"insert into userinfo(user_id, user_pw, user_pw_check, user_name, user_email, user_email_send, user_jumin, user_phone, user_gender) "
		+ "values(?,?,?,?,?,?,?,?,?)";
		public static final String  USER_UPDATE=
		"update userinfo set user_pw=?,user_pw_check=?,user_name=?,user_email=?,user_email_send=?,user_phone=? where user_id=?";
		public static final String  USER_DELETE=
		"delete from userinfo where user_id=?";
		public static final String  USER_SELECT_BY_ID=
		"select user_id, user_pw, user_pw_check, user_name, user_email, user_email_send, user_jumin, user_phone, user_gender from userinfo where user_id=?";
		
		public static final String  USER_SELECT_ALL=
		"select user_id, user_pw, user_pw_check, user_name, user_email, user_email_send, user_jumin, user_phone, user_gender from userinfo";
		public static final String USER_SELECT_BY_NO_COUNT =
		"select count(*) as cnt from userinfo where user_id= ?";
	}

