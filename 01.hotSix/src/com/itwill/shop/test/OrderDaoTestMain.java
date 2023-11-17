package com.itwill.shop.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartDao;
import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderDao;
import com.itwill.shop.order.OrderItem;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductDao;

public class OrderDaoTestMain {
	public static void main(String[] args) throws Exception  {
		OrderDao orderDao = new OrderDao();
		ProductDao productDao = new ProductDao();
		
		System.out.println(orderDao.findByUserId("guard1"));
		ArrayList<OrderItem> orderItemList = new ArrayList<OrderItem>();
		OrderItem orderItem = new OrderItem(0, 3, productDao.findByPrimaryKey(1), 1);
//		orderItemList.add(orderItem);
		
		Order newOrder = new Order(0, "김국민", "010-5219-8521", 5000, null, "user10", orderItemList);
		
		orderDao.insert(newOrder);
		
//		orderDao.deleteByUserId("user10");
		
		
		ArrayList<Order> orderList = new ArrayList<Order>();
		orderList = orderDao.findByUserId("user10");
		for (Order order : orderList) {
			System.out.println(order.getOrderItemList());
		}
		
		
		
		
		

		// 상품에서 직접 주문
//		int p_qty=1;
//		int p_no=1;
//		ProductDao productDao=new ProductDao();
//		
//		
//		ArrayList<OrderItem> jumunDetailList=new ArrayList<OrderItem>();
//		jumunDetailList.add(new OrderItem(0, p_qty, new Product(p_no, new Date(0), "미술", "축구", "세모발", "/images.jpg", 0), p_no));
//		Order newJumun=new Order(0, "구매자", "번호", 5000, new Date(0), "guard1", jumunDetailList);
//		
//		System.out.println(orderDao.insert(newJumun));
		
		// 장바구니에서 결제
		
	
	}
}
