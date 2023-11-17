package com.itwill.shop.product;

public class ProductSQL {
	//product 전체출력
	public final static String PRODUCT_SELECT_ALL = "select * from product";
	//product 번호에 따른 출력
	public final static String PRODUCT_SELECT_BY_NO = "select * from product where product_no=?";
	//product 이름에 따른 검색
	public final static String PRODUCT_SELECT_BY_NAME = "select * from product where product_name like '%'||?||'%'";
	//product 카테고리에 따른 검색
	public final static String PRODUCT_SELECT_BY_CATEGORY = "select * from product where product_category=?";
	//product 조회수 증가 기능
	public final static String PRODUCT_UPDATE_READ_COUNT = "update product set product_read_count=product_read_count+1 where product_no=?";	
	//product 중 최대 조회수 값 가진 로우 출력
	public final static String PRODUCT_SELECT_MAX_READ_COUNT="select * from product where product_read_count = (select max(product_read_count) from product)";
	//product 중 남은 인원수(좌석수) 업데이트
	public final static String PRODUCT_UPDATE_SEATLEFT_COUNT="update product set product_seatLeft_count=product_seatLeft_count-1 where product_no=?";
}
