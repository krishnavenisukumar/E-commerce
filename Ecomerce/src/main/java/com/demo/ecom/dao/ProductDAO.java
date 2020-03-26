package com.demo.ecom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.ecom.entity.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

	
	@Query(value="select * from Product p where p.product_name like %:productName%", nativeQuery=true)
	List<Product> findByProductMatchingName(@Param("productName") String productName);
	
}
