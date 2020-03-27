package com.demo.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductsShops {
	@Id
	private Integer id;
	private Integer productId;
	private Integer	shopId;
	private Integer quantity;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	
	public ProductsShops(Integer id, Integer productId, Integer shopId, Integer quantity) {
		super();
		this.id = id;
		this.productId = productId;
		this.shopId = shopId;
		this.quantity = quantity;
	}
	public ProductsShops()
	{
		super();
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	@Override
	public String toString() {
		return "ProductsShops [id=" + id + ", productId=" + productId + ", shopId=" + shopId + ", quantity=" + quantity
				+ "]";
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
