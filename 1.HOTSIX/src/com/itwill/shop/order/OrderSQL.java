package com.itwill.shop.order;

public class OrderSQL {
	public final static String ORDER_INSERT = "insert into orders(order_no, order_name, order_phone, order_price, order_date, user_id)"
			+ " values(orders_order_no_SEQ.nextval, ?, ?, ?, sysdate, ?)";
	public final static String ORDERITEM_INSERT = "insert into order_item(oi_no, oi_qty, product_no, order_no)"
			+ " values(order_item_oi_no_SEQ.nextval, ?, ?, orders_order_no_SEQ.currval)";

	public final static String ORDER_SELECT_BY_USERID = "select * from orders o join order_item oi on o.order_no=oi.order_no join product p on oi.product_no=p.product_no where o.user_id=?";
	
	public final static String ORDER_DELETE_BY_USERID = "delete from orders where user_id=?";
	public final static String ORDER_DELETE_BY_O_NO = "delete from orders where order_no=?";
	
	
}
