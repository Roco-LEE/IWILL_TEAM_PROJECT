package com.itwill.shop.test;

import java.sql.Date;
import java.util.List;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartDao;
import com.itwill.shop.product.Product;

public class CartDaoTestMain {
	public static void main(String[] args) throws Exception  {
		CartDao cartDao=new CartDao();
		System.out.println("1.insert");
		Cart addCart=new Cart(0, 1, "guard3",
				new Product(1, new Date(0), "공예", "축구수업", 5000, "재밌는 수업", "/images", 0, 0));
		
		int rowCount = -999;
		
		rowCount = cartDao.insert(addCart);
		System.out.println(">>" + rowCount);
		
		System.out.println("2.delete");
		rowCount=cartDao.deleteByCartNo(6);
		System.out.println(">>" + rowCount);
		System.out.println("2.delete");
		rowCount=cartDao.deleteByCartUserId("guard1");
		System.out.println(">>" + rowCount);
		System.out.println("4.cartList[select]");
		List<Cart> cartList1=cartDao.findByUserId("guard3");
		System.out.println("guard1-->"+cartList1);
		
		System.out.println("2.updateByCartNo");
		rowCount=cartDao.updateByCartNo(9, 2);
		System.out.println(">> "+rowCount);
		
		System.out.println("2.updateByCartNo");
		rowCount=cartDao.updateQtyUp(9);
		System.out.println(">> "+rowCount);
		
		System.out.println("2.updateByCartNo");
		rowCount=cartDao.updateQtyDown(9);
		System.out.println(">> "+rowCount);
		
	}
}
