package com.demo.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shop {
	@Id
	private Integer shopId;
	private String shopName;

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Shop() {
		super();

	}

	public Shop(Integer shopId, String shopName) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
	}

}
