package com.demo.ecom.entity;

public class ShopQuantity {
	
	private Integer shopId;
	private Integer quantity;
	
	public ShopQuantity()
	{
		super();
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ShopQuantity [shopId=" + shopId + ", quantity=" + quantity + "]";
	}

	public ShopQuantity(Integer shopId, Integer quantity) {
		super();
		this.shopId = shopId;
		this.quantity = quantity;
	}

}
