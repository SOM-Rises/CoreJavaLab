
/*
 Program : Create an product class.
		   Create an ArrayList and perform following operations
			1. Add an product
			2. Delete a product.
			3.Display all the products 
			> Sort on the basis of price
			>Sort on the basis of quantity
 @Author : Somnath Hazra
 @Date : 26 Oct
*/
package com.ProductArrayList;

public class Product {

	private int productId;
	private String productName;
	private int productQuantity;
	private int productPrice;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int productQuantity, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQuantity="
				+ productQuantity + ", productPrice=" + productPrice + "]";
	}

}
