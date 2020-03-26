package com.demo.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecom.dao.PurchaseProductDAO;
import com.demo.ecom.entity.PurchaseProduct;
import com.demo.ecom.response.ResponseObject;
import com.demo.ecom.utils.ResponseUtils;
@Service
public class ProductsPurchaseImpl implements ProductsPurchase {

	@Autowired
	PurchaseProductDAO purchaseProductDAO;
	
	@Autowired
	ResponseUtils responseUtils;
	
	
	@Override
	public ResponseObject purchaseProduct(PurchaseProduct purchaseProduct) {
		PurchaseProduct product  = purchaseProductDAO.save(purchaseProduct);
		return responseUtils.createPurchaseResponse(product);
	}

}
