package com.demo.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecom.entity.CustomerFeedback;
import com.demo.ecom.response.ResponseObject;
import com.demo.ecom.service.CustomerFeedbackServiceImpl;

@RestController
public class CustomerFeedbackController {
	
	
	@Autowired
	CustomerFeedbackServiceImpl customerFeedbackServiceImpl;
	
	@PostMapping("/sharefeedback")
	public ResponseEntity<ResponseObject> saveFeedback(@RequestBody CustomerFeedback customerFeedback) {
		ResponseObject responseObject =  customerFeedbackServiceImpl.saveCustomerFeedback(customerFeedback);
		  return new ResponseEntity<>(responseObject, HttpStatus.OK);
	}
}
