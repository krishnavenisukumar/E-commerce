package com.demo.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductsShops {
	@Id
	private Integer id;
	private Integer productId;
	private Integer	shopId;
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
	@Override
	public String toString() {
		return "ProductsShops [id=" + id + ", productId=" + productId + ", shopId=" + shopId + "]";
	}
	public ProductsShops(Integer id, Integer productId, Integer shopId) {
		super();
		this.id = id;
		this.productId = productId;
		this.shopId = shopId;
	}
	
	public ProductsShops()
	{
		super();
	}

}
