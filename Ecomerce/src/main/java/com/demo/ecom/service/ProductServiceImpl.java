package com.demo.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecom.dao.PoductShopDAO;
import com.demo.ecom.dao.ProductDAO;
import com.demo.ecom.entity.Product;
import com.demo.ecom.entity.ProductsShops;
import com.demo.ecom.response.ResponseObject;
import com.demo.ecom.utils.ResponseUtils;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	@Autowired
	ResponseUtils responseUtils;
	
	@Autowired
	PoductShopDAO poductShopDAO;
	
	@Override
	public ResponseObject getProductsDetails(String productName) {
		
		List<Product> productList = productDAO.findByProductMatchingName(productName);
		
		test();
		return responseUtils.createProductResponse(productList);
	}

	public void test() {
	
			List <ProductsShops> list2 = poductShopDAO.findByProductId(1);
			System.out.println(list2);
		}
		
	
	
}
