package com.demo.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
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
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", productBrand=" + productBrand + ", productDescription=" + productDescription + "]";
	}
	public Product(Integer productId, String productName, Double productCost, String productBrand,
			String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.productBrand = productBrand;
		this.productDescription = productDescription;
	}
	public Product() {
		super();
	}
}
