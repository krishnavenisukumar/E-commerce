package com.demo.ecom.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

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

import com.demo.ecom.entity.Product;
import com.demo.ecom.response.Message;
import com.demo.ecom.response.ResponseObject;
import com.demo.ecom.service.ProductServiceImpl;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
class ProductControllerTest {

	@Mock
	private ProductServiceImpl productServiceImpl;

	@InjectMocks
	private ProductController productController;

	@Before(value = "")
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	List<Product> productList = null;
	Product product = null;

	@Test
	void testGetProducts() {

		productList = new ArrayList<>();
		product = new Product();
		product.setProductId(1);
		product.setProductName("dettol");
		product.setProductDescription("hand wash");
		product.setProductCost(500.00);
		product.setProductBrand("dettol");
		productList.add(product);

		Message message = new Message();
		message.setStatusCode("200");
		message.setMessage("Product details are extracted successfully.");

		ResponseObject responseObject = new ResponseObject();
		responseObject.setObject(productList);
		responseObject.setMessage(message);
		System.out.println("responseObject " + responseObject);
		String productName = "wash";

		Mockito.when(productServiceImpl.getProductsDetails(productName)).thenReturn(responseObject);

		ResponseEntity<ResponseObject> response = productController.getProducts(productName);
		assertEquals(response.getStatusCode(), HttpStatus.OK);
	}

}
