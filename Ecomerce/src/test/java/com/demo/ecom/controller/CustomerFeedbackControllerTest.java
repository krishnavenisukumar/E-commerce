package com.demo.ecom.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.demo.ecom.entity.CustomerFeedback;
import com.demo.ecom.response.Message;
import com.demo.ecom.response.ResponseObject;
import com.demo.ecom.service.CustomerFeedbackServiceImpl;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
class CustomerFeedbackControllerTest {

	@Mock
	private CustomerFeedbackServiceImpl customerFeedbackServiceImpl;

	@InjectMocks
	private CustomerFeedbackController customerFeedbackController;

	@Before(value = "")
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void testSaveFeedback() {
		CustomerFeedback customerFeedback = new CustomerFeedback();
		customerFeedback.setDescription("");
		customerFeedback.setProductId(1);
		customerFeedback.setShopId(1);
		customerFeedback.setUserName("ABC");
		Message message = new Message();
		message.setStatusCode("200");
		message.setMessage("Your Feedback is saved successfully.");
		ResponseObject responseObject = new ResponseObject();
		responseObject.setObject(customerFeedback);
		responseObject.setMessage(message);
		Mockito.when(customerFeedbackServiceImpl.saveCustomerFeedback(customerFeedback)).thenReturn(responseObject);
		ResponseEntity<ResponseObject> response = customerFeedbackController.saveFeedback(customerFeedback);
		assertEquals(HttpStatus.OK,response.getStatusCode());

	}
}
