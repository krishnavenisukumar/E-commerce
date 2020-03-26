package com.demo.ecom.entity;

public class ProductShop {

	private Integer productId;
	private Integer shopId;

	@Override
	public String toString() {
		return "ProductShop [productId=" + productId + ", shopId=" + shopId + "]";
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

	public ProductShop() {
		super();
	}
}
