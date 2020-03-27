package com.demo.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecom.entity.PurchaseProduct;
import com.demo.ecom.response.ResponseObject;
import com.demo.ecom.service.ProductsPurchaseImpl;

@RestController
public class PurchaseProductController {
	
	@Autowired
	ProductsPurchaseImpl productsPurchaseImpl;
	
	@PostMapping("/purchaseproducts")
	public ResponseEntity<ResponseObject> buyProducts(@RequestBody PurchaseProduct purchaseProduct) {
		ResponseObject responseObject = productsPurchaseImpl.purchaseProduct(purchaseProduct);
		 return new ResponseEntity<>(responseObject, HttpStatus.OK);
	}
}
