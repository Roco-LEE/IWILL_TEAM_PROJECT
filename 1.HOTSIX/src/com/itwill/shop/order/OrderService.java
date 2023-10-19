package com.itwill.shop.order;

import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartDao;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductDao;
import com.itwill.shop.userinfo.User;
import com.itwill.shop.userinfo.UserDao;
import com.itwill.shop.userinfo.UserService;

public class OrderService {
	private OrderDao orderDao;
	private ProductDao productDao;
	private UserDao userDao;
	private CartDao cartDao;
	
	public OrderService() throws Exception {
		orderDao=new OrderDao();
		productDao = new ProductDao();
		userDao = new UserDao();
		cartDao = new CartDao();
	}
	
	public OrderService(OrderDao orderDao, ProductDao productDao, CartDao cartDao) throws Exception{
		this.orderDao = orderDao;
		this.productDao = productDao;
		this.cartDao = cartDao;
	}

	// 주문생성 (카트 -> 결제)
	public int create(String sUserId) throws Exception {
		List<Cart> cartList=cartDao.findByUserId(sUserId);
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		User cartUser = userDao.findByUserId(sUserId);
		int o_tot_price=0;
		for (Cart cart : cartList) {
			OrderItem orderItem=new OrderItem(0, cart.getCart_qty(), cart.getProduct(), 0);
			orderItemList.add(orderItem);
			o_tot_price+=orderItem.getOiQty()*orderItem.getProduct().getProduct_price();
		}
		Order newOrder=new Order(0, cartUser.getUserName(), cartUser.getUserPhone(), o_tot_price, null, sUserId, orderItemList);
		orderDao.insert(newOrder);
		cartDao.deleteByCartUserId(sUserId);
		return 0;
	}
	
	// 상품1개 바로결제
	public int create(String sUserId, int p_no, int oi_qty) throws Exception{
		Product product=productDao.findByPrimaryKey(p_no);
		OrderItem orderItem=new OrderItem(0, oi_qty, product, 0);
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		orderItemList.add(orderItem);
		Order newOrder=
				new Order(0,
						userDao.findByUserId(sUserId).getUserName(), 
						userDao.findByUserId(sUserId).getUserPhone(),
						orderItemList.get(0).getOiQty()*orderItemList.get(0).getProduct().getProduct_price(),
						null,
						sUserId,
						orderItemList);
		return orderDao.insert(newOrder);
	}
	
	
	// 주문내역 (결제완료 조회)
	public ArrayList<Order> list(String selectUserId) throws Exception{
		return orderDao.findByUserId(selectUserId);
	}
	
	public ArrayList<OrderItem> oiList(String selectUserId) throws Exception{
		return orderDao.orderItemList(selectUserId);
	}
	
	
}
