package com.itwill.shop.userinfo;

public class User {
	
	/*
	이름              널?       유형            
			--------------- -------- ------------- 
			USER_ID         NOT NULL VARCHAR2(100) 
			USER_PW                  VARCHAR2(100) 
			USER_PW_CHECK            VARCHAR2(100) 
			USER_NAME                VARCHAR2(100) 
			USER_EMAIL               VARCHAR2(100) 
			USER_EMAIL_SEND          VARCHAR2(100) 
			USER_JUMIN               VARCHAR2(100) 
			USER_PHONE               VARCHAR2(100) 
			USER_GENDER              VARCHAR2(100) 
    */
	
	private String userId;
	private String userPw;
	private String userPwCheck;
	private String userName;
	private String userEmail;
	private String userEmailSend;
	private String userJumin;
	private String userPhone;
	private String userGender;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String userPw, String userPwCheck, String userName, String userEmail,
			String userEmailSend, String userJumin, String userPhone, String userGender) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userPwCheck = userPwCheck;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userEmailSend = userEmailSend;
		this.userJumin = userJumin;
		this.userPhone = userPhone;
		this.userGender = userGender;
	}
	
	
	/*************************************/
	public User(String userId, String userPw) {
		this.userId=userId;
		this.userPw=userPw;
	}

	/*************************************/
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserPwCheck() {
		return userPwCheck;
	}

	public void setUserPwCheck(String userPwCheck) {
		this.userPwCheck = userPwCheck;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserEmailSend() {
		return userEmailSend;
	}

	public void setUserEmailSend(String userEmailSend) {
		this.userEmailSend = userEmailSend;
	}

	public String getUserJumin() {
		return userJumin;
	}

	public void setUserJumin(String userJumin) {
		this.userJumin = userJumin;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userPwCheck=" + userPwCheck + ", userName="
				+ userName + ", userEmail=" + userEmail + ", userEmailSend=" + userEmailSend + ", userJumin="
				+ userJumin + ", userPhone=" + userPhone + ", userGender=" + userGender + "]";
	}


	
	
	
	
}
