package com.itwill.shop.test;

import com.itwill.shop.product.ProductDao;

public class ProductDaoTestMain {
	public static void main(String[] args) throws Exception {
		
	ProductDao productDao=new ProductDao();
	System.out.println("1.selectAll:");
	System.out.println("  "+productDao.findAll());
	System.out.println("2.findByPrimaryKey");
	System.out.println(productDao.findByPrimaryKey(0));
	System.out.println("3.findByKeyword");
	System.out.println(productDao.findByKeyword("연남"));
	System.out.println("4.findByCategory");
	System.out.println(productDao.findByCategory(null));
	System.out.println("5.updateByReadCount");
	//productDao.updateByReadCount(0);
	System.out.println(productDao.updateByReadCount(0));
	System.out.println("6.selectByMaxReadCount");
	System.out.println(productDao.selectByMaxReadCount(1));
	System.out.println("7.updateBySeatLeftCount");
	System.out.println(productDao.updateBySeatLeftCount(0));
	}
	
	
	
}
