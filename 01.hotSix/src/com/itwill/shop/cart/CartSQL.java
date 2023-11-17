package com.itwill.shop.cart;

public class CartSQL {
	public static final String CART_INSERT=
			"insert into cart(cart_no,cart_qty,user_id,product_no) values (cart_cart_no_SEQ.nextval,?,?,?)";
	public static final String CART_SELECT_BY_USERID=
			"select * from cart c join product p on c.product_no=p.product_no where c.user_id=?";
	public static final String CART_SELECT_BY_CART_NO=
			"select * from cart c join product p on c.product_no=p.product_no where c.cart_no=?";
	public static final String CART_DELETE_BY_CART_NO=
			"delete from cart where cart_no=?";
	public static final String CART_DELETE_BY_USERID=
			"delete from cart where user_id=?";
	public static final String CART_UPDATE_DATE=
			"update product set product_start_date = to_date(?, 'YYYYMMDD') WHERE product_no = ?";
	public static final String CART_UPDATE_QTY_UP=
			"update cart set cart_qty=cart_qty+1 where cart_no=?";
	public static final String CART_UPDATE_QTY_DOWN=
			"update cart set cart_qty=cart_qty-1 where cart_no=?";
	public static final String CART_UPDATE_BY_CARTNO=
			"update cart set cart_qty=? where cart_no=?";







}



