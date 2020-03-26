package com.demo.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shop {
	@Id
	private Integer shopId;
	private String shopName;
}
