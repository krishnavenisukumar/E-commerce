package com.demo.ecom.entity;

import java.util.List;

public class ProductShop {

	private List<ShopQuantity> shop;
	
	public ProductShop() {
		super();
	}
	public ProductShop(List<ShopQuantity> shop, Integer productId, String productName, Double productCost,
			String productBrand, String productDescription) {
		super();
		this.shop = shop;
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.productBrand = productBrand;
		this.productDescription = productDescription;
	}
	private Integer productId;
	private String productName;	
	private Double productCost;
	private String productBrand;
	private String productDescription;
	
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
	public List<ShopQuantity> getShop() {
		return shop;
	}
	public void setShop(List<ShopQuantity> shop) {
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "ProductShop [shop=" + shop + ", productId=" + productId + ", productName=" + productName
				+ ", productCost=" + productCost + ", productBrand=" + productBrand + ", productDescription="
				+ productDescription + "]";
	}
	

	
}
