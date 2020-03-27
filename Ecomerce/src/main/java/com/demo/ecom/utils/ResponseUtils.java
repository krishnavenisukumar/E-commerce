package com.demo.ecom.utils;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.ecom.entity.CustomerFeedback;
import com.demo.ecom.entity.ProductShop;
import com.demo.ecom.entity.PurchaseProduct;
import com.demo.ecom.response.Message;
import com.demo.ecom.response.ResponseObject;

@Service
public class ResponseUtils {

		private ResponseObject responseObj = null;
		private Message message = null;

		/**
		 * @param schedule
		 * @return
		 */
		public ResponseObject createProductResponse(List<ProductShop> product) {
			
			responseObj = new ResponseObject();
			message = new Message();
			if (product != null && (!product.isEmpty())) {
				message.setMessage("Product details are extracted successfully.");
				message.setStatusCode("200");
				responseObj.setObject(product);
				responseObj.setMessage(message);
			} else {
				message.setMessage("Product is not available");
				message.setStatusCode("400");
				responseObj.setMessage(message);
			}
			return responseObj;
		}
		public ResponseObject createPurchaseResponse(PurchaseProduct product) {
			
			responseObj = new ResponseObject();
			message = new Message();
			if (product != null) {
				message.setMessage("Product order is placed successfully.");
				message.setStatusCode("200");
				responseObj.setObject(product);
				responseObj.setMessage(message);
			} else {
				message.setMessage("Product order not placed successfully.");
				message.setStatusCode("400");
				responseObj.setMessage(message);
			}
			return responseObj;
		}
		
		
		
		public ResponseObject createFeedBackResponse(CustomerFeedback savedFeedback) {
			
			responseObj = new ResponseObject();
			message = new Message();
			if (savedFeedback != null) {
				message.setMessage("Your Feedback is saved successfully.");
				message.setStatusCode("200");
				responseObj.setObject(savedFeedback);
				responseObj.setMessage(message);
			} else {
				message.setMessage("Your Feedback is not saved. Please try later.");
				message.setStatusCode("400");
				responseObj.setMessage(message);
			}
			return responseObj;
		}
		
	}

