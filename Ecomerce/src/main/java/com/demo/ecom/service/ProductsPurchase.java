package com.demo.ecom.service;

import com.demo.ecom.entity.PurchaseProduct;
import com.demo.ecom.response.ResponseObject;

public interface ProductsPurchase {
	
	public ResponseObject purchaseProduct(PurchaseProduct purchaseProduct);

}
