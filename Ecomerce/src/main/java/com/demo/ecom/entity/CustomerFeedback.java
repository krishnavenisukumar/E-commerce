package com.demo.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerFeedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer feedBackId;
	private Integer productId;
	private Integer shopId;
	private String description;
	private String userName;
	private String phoneNumber;
	
	public CustomerFeedback(Integer feedBackId, Integer productId, Integer shopId, String description, String userName,
			String phoneNumber) {
		super();
		this.feedBackId = feedBackId;
		this.productId = productId;
		this.shopId = shopId;
		this.description = description;
		this.userName = userName;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public CustomerFeedback() {
		super();
	}
	public Integer getFeedBackId() {
		return feedBackId;
	}
	public void setFeedBackId(Integer feedBackId) {
		this.feedBackId = feedBackId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "CustomerFeedback [feedBackId=" + feedBackId + ", productId=" + productId + ", shopId=" + shopId
				+ ", description=" + description + ", userName=" + userName + ", phoneNumber=" + phoneNumber + "]";
	}

}
