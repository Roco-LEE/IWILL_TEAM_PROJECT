package com.itwill.shop.test;

import com.itwill.shop.product.ProductService;//

public class ProductServiceTestMain {
	public static void main(String[] args) throws Exception  {
		
		ProductService productService=new ProductService();
		System.out.println("1.selectAll:");
		System.out.println("  "+productService.productList());
		System.out.println("2.findByPrimaryKey");
		System.out.println(productService.productDetail(1));
		System.out.println("3.findByKeyword");
		System.out.println(productService.productSearch("마들렌"));
		System.out.println("4.findByCategory");
		System.out.println(productService.productCategorySearch("미술"));
		System.out.println("5.updateByReadCount");
		System.out.println(productService.productReadCount(2));
		System.out.println("6.selectByMaxReadCount");
		System.out.println(productService.productMaxReadCount(0));
		System.out.println("7.updateBySeatLeftCount");
		System.out.println(productService.productSeatLeftCount(0));
	}
}
