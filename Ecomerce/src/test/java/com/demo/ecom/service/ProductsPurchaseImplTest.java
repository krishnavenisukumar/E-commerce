package com.demo.ecom.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.demo.ecom.dao.ProductDAO;
import com.demo.ecom.dao.PurchaseProductDAO;
import com.demo.ecom.entity.Product;
import com.demo.ecom.entity.PurchaseProduct;
import com.demo.ecom.response.Message;
import com.demo.ecom.response.ResponseObject;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
class ProductsPurchaseImplTest {

	@InjectMocks
	ProductsPurchaseImpl productsPurchaseImpl;

	@Mock
	PurchaseProductDAO purchaseProductDAO;

	PurchaseProduct purchaseProduct = null;

	@Test
	void testPurchaseProduct() {
		
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

		Mockito.when(purchaseProductDAO.findById(1)).thenReturn(Optional.of(purchaseProduct));
		assertNotNull(responseObject);

	}

}
