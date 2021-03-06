package com.demo.ecom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecom.entity.PurchaseProduct;

@Repository
public interface PurchaseProductDAO extends JpaRepository<PurchaseProduct, Integer> {

}
