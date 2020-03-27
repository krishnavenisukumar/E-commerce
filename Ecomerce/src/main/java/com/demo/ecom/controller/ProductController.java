package com.demo.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecom.response.ResponseObject;
import com.demo.ecom.service.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@GetMapping("/product/{productname}")
	public ResponseEntity<ResponseObject> getProducts(@PathVariable String productname) {
		ResponseObject responseObject =  productServiceImpl.getProductsDetails(productname);
		  return new ResponseEntity<>(responseObject, HttpStatus.OK);
	}
}
