package com.pms.model;

public class Product {
	private int productId;
	private String productName;
	private String cost;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, String cost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
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
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost + "]";
	}
	
}
