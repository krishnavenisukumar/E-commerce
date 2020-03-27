package com.demo.ecom.service;

import java.util.List;

import com.demo.ecom.entity.Product;
import com.demo.ecom.entity.ProductShop;
import com.demo.ecom.response.ResponseObject;

public interface ProductService {
	
	public ResponseObject getProductsDetails(String productName);
	public List<ProductShop> assignStoresToProduct(List<Product> productList);
}
