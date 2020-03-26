package com.demo.ecom.entity;

import java.util.List;

public class ProductAvailableShops {
	
	private Integer productId;
	private String productName;	
	private Double productCost;
	private String productBrand;
	private String productDescription;
	List<Shop> shop;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductCost() {
		return productCost;
	}
	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public List<Shop> getShop() {
		return shop;
	}
	public void setShop(List<Shop> shop) {
		this.shop = shop;
	}
	public ProductAvailableShops(Integer productId, String productName, Double productCost, String productBrand,
			String productDescription, List<Shop> shop) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.productBrand = productBrand;
		this.productDescription = productDescription;
		this.shop = shop;
	}
	public ProductAvailableShops() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductAvailableShops [productId=" + productId + ", productName=" + productName + ", productCost="
				+ productCost + ", productBrand=" + productBrand + ", productDescription=" + productDescription
				+ ", shop=" + shop + "]";
	}
	
	

}
