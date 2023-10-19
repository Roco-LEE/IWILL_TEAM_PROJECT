package com.itwill.shop.order;

import com.itwill.shop.product.Product;

/*
  이름         널?       유형         
---------- -------- ---------- 
OI_NO      NOT NULL NUMBER(10) 
OI_QTY              NUMBER(10) 
PRODUCT_NO          NUMBER(10) 
ORDER_NO            NUMBER(10) 
 */
public class OrderItem {
	private int oiNo;
	private int oiQty;
	private Product product;
	private int orderNo;
	
	public OrderItem(int oiNo, int oiQty, Product product, int orderNo) {
		super();
		this.oiNo = oiNo;
		this.oiQty = oiQty;
		this.product = product;
		this.orderNo = orderNo;
	}
	
	public int getOiNo() {
		return oiNo;
	}
	public void setOiNo(int oiNo) {
		this.oiNo = oiNo;
	}
	public int getOiQty() {
		return oiQty;
	}
	public void setOiQty(int oiQty) {
		this.oiQty = oiQty;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	@Override
	public String toString() {
		return "OrderItem [oiNo=" + oiNo + ", oiQty=" + oiQty + ", product=" + product + ", orderNo=" + orderNo + "]\n";
	}
	
	
	
	
}
