package com.demo.ecom.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.demo.ecom.dao.PoductShopDAO;
import com.demo.ecom.dao.ProductDAO;
import com.demo.ecom.entity.Product;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
class ProductServiceImplTest {


	@InjectMocks
	ProductServiceImpl productServiceImpl;
	
	@Mock
	ProductDAO productDAO;
	@Mock
	PoductShopDAO poductShopDAO;
	
	@Test
	void testGetProductsDetails() {
		List<Product> list = new ArrayList<Product>();
		Product p = new Product(1, "Dettol HandWash", 500.0, "Dettol","Handwash");
		list.add(p);
		
		when(productDAO.findByProductMatchingName("wash")).thenReturn(list);
		
		List<Product> productListFromDAO = productDAO.findByProductMatchingName("wash");
		assertEquals(1,productListFromDAO.size());
		verify(productDAO, times(1)).findByProductMatchingName("wash");
	}
	
}	


