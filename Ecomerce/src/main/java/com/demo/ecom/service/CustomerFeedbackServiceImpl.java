package com.demo.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecom.dao.CustomerFeedbackDAO;
import com.demo.ecom.entity.CustomerFeedback;
import com.demo.ecom.entity.User;
import com.demo.ecom.response.ResponseObject;
import com.demo.ecom.utils.ResponseUtils;

@Service
public class CustomerFeedbackServiceImpl implements CustomerFeedbackService {

	@Autowired
	CustomerFeedbackDAO customerFeedbackDAO;
	@Autowired
	ResponseUtils responseUtils;
	@Autowired
	UserServiceImpl userServiceImpl;

	@Override
	public ResponseObject saveCustomerFeedback(CustomerFeedback feedback) {
		CustomerFeedback savedFeedback = null;

		savedFeedback = customerFeedbackDAO.save(feedback);
		return responseUtils.createFeedBackResponse(savedFeedback);
	}
}
