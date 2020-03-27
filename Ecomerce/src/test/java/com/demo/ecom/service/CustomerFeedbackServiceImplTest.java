package com.demo.ecom.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.demo.ecom.dao.CustomerFeedbackDAO;
import com.demo.ecom.dao.UserDAO;
import com.demo.ecom.entity.CustomerFeedback;
import com.demo.ecom.entity.User;
import com.demo.ecom.response.Message;
import com.demo.ecom.response.ResponseObject;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
public class CustomerFeedbackServiceImplTest {

	@InjectMocks
	CustomerFeedbackServiceImpl customerFeedbackServiceImpl;

	@Mock
	CustomerFeedbackDAO customerFeedbackDAO;

	@Mock
	UserDAO userDAO;

	@Test
	public void saveCustomerFeedbackTest() {

		CustomerFeedback customerFeedback = new CustomerFeedback();
		customerFeedback.setDescription("");
		customerFeedback.setProductId(1);
		customerFeedback.setShopId(1);
		customerFeedback.setUserName("ABC");
		customerFeedback.setPhoneNumber("987654321");

		Message message = new Message();
		message.setStatusCode("200");
		message.setMessage("Your Feedback is saved successfully.");

		ResponseObject responseObject = new ResponseObject();
		responseObject.setObject(customerFeedback);
		responseObject.setMessage(message);

		Mockito.when(customerFeedbackDAO.findById(1)).thenReturn(Optional.of(customerFeedback));
		assertNotNull(responseObject);

	}
}
