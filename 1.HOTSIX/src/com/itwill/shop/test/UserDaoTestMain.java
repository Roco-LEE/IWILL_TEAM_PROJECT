package com.itwill.shop.test;

import com.itwill.shop.userinfo.User;
import com.itwill.shop.userinfo.UserDao;

public class UserDaoTestMain {
	public static void main(String[] args) throws Exception  {
		UserDao userDao=new UserDao();
		System.out.println("1.create:"+
				userDao.insert(new User("user11", "9999","9999","배수지","suzi@naver.com", "F", "990811", "010-9999-9999","여성")));
		
		System.out.println("2.findUser:"+userDao.findByUserId("user11"));
		System.out.println("3.update:"+userDao.update(new User("user10", "7777", "7777","이효민", "tenten@naver.com", "F", null, "010-7777-5665", null)));

		System.out.println("4.remove:"+ userDao.delete("user10"));
	}
}
	