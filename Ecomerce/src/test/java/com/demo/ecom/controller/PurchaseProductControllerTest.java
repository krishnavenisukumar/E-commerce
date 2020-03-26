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

import com.demo.ecom.entity.PurchaseProduct;
import com.demo.ecom.response.Message;
import com.demo.ecom.response.ResponseObject;
import com.demo.ecom.service.ProductsPurchaseImpl;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
class PurchaseProductControllerTest {

	@Mock
	private ProductsPurchaseImpl productsPurchaseImpl;
	

	@InjectMocks
	private PurchaseProductController purchaseProductController;

	@Before(value = "")
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	PurchaseProduct purchaseProduct = null;
	
	@Test
	void testBuyProducts() {
		purchaseProduct = new PurchaseProduct();
		purchaseProduct.setPurchaseId(1);
		purchaseProduct.setUserName("ABC");
		purchaseProduct.setProductId(1);
		purchaseProduct.setShopId(1);
		purchaseProduct.setPhoneNumber("9972207104");
		
		Message message = new Message();
		message.setStatusCode("200");
		message.setMessage("Product order is placed successfully.");

		ResponseObject responseObject = new ResponseObject();
		responseObject.setObject(purchaseProduct);
		responseObject.setMessage(message);
		System.out.println("responseObject " + responseObject);
		Mockito.when(productsPurchaseImpl.purchaseProduct(purchaseProduct)).thenReturn(responseObject);
		
		ResponseEntity<ResponseObject> response = purchaseProductController.buyProducts(purchaseProduct);
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		
	}

}
