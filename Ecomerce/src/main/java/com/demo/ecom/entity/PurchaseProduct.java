package com.demo.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseProduct {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer purchaseId;
	private String userName;
	private String phoneNumber;
	private Integer productId;
	private Integer	shopId;
	
	public PurchaseProduct(Integer purchaseId, String userName, String phoneNumber, Integer productId, Integer shopId) {
		super();
		this.purchaseId = purchaseId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.productId = productId;
		this.shopId = shopId;
	}

	public PurchaseProduct() {
		super();
	}

	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	
	
}