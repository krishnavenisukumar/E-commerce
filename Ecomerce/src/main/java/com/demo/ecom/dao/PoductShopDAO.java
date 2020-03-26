package com.demo.ecom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecom.entity.ProductsShops;
@Repository
public interface PoductShopDAO extends JpaRepository<ProductsShops, Integer> {
	
	List<ProductsShops> findByProductId(Integer id);

}
