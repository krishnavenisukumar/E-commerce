package com.demo.ecom.service;

import com.demo.ecom.entity.CustomerFeedback;
import com.demo.ecom.response.ResponseObject;

public interface CustomerFeedbackService {
	
	public ResponseObject saveCustomerFeedback(CustomerFeedback feedback);

}
