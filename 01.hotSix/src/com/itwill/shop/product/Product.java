package com.itwill.shop.product;

import java.sql.Date;

/*
이름                 널?       유형            
------------------ -------- ------------- 
PRODUCT_NO         NOT NULL NUMBER(10)    
PRODUCT_START_DATE          DATE          
PRODUCT_CATEGORY            VARCHAR2(100) 
PRODUCT_NAME                VARCHAR2(100) 
PRODUCT_DETAIL              VARCHAR2(100) 
PRODUCT_IMAGE               VARCHAR2(100) 
PRODUCT_READ_COUNT          NUMBER(10)  
 */
public class Product {
	private int product_no;
	private Date product_start_date;
	private String product_category;
	private String product_name;
	private int product_price;
	private String product_detail;
	private String product_image;
	private int product_read_count;
	private int product_seatLeft_count;
	
	public Product() {
	}
	
	public Product(int product_no, Date product_start_date, String product_category, String product_name,
			int product_price, String product_detail, String product_image, int product_read_count,
			int product_seatLeft_count) {
		super();
		this.product_no = product_no;
		this.product_start_date = product_start_date;
		this.product_category = product_category;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_detail = product_detail;
		this.product_image = product_image;
		this.product_read_count = product_read_count;
		this.product_seatLeft_count = product_seatLeft_count;
	}

	
	
	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public Date getProduct_start_date() {
		return product_start_date;
	}

	public void setProduct_start_date(Date product_start_date) {
		this.product_start_date = product_start_date;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getProduct_detail() {
		return product_detail;
	}

	public void setProduct_detail(String product_detail) {
		this.product_detail = product_detail;
	}

	public String getProduct_image() {
		return product_image;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	public int getProduct_read_count() {
		return product_read_count;
	}

	public void setProduct_read_count(int product_read_count) {
		this.product_read_count = product_read_count;
	}

	public int getProduct_seatLeft_count() {
		return product_seatLeft_count;
	}

	public void setProduct_seatLeft_count(int product_seatLeft_count) {
		this.product_seatLeft_count = product_seatLeft_count;
	}

	@Override
	public String toString() {
		return "Product [product_no=" + product_no + ", product_start_date=" + product_start_date
				+ ", product_category=" + product_category + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_detail=" + product_detail + ", product_image=" + product_image
				+ ", product_read_count=" + product_read_count + ", product_seatLeft_count=" + product_seatLeft_count
				+ "]";
	}

	

	
}
