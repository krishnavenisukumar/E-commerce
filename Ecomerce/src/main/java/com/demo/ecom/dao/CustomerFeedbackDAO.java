package com.demo.ecom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecom.entity.CustomerFeedback;
@Repository
public interface CustomerFeedbackDAO extends JpaRepository<CustomerFeedback, Integer> {

}
