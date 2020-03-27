package com.demo.ecom.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.ecom.entity.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

	Optional<User> findByUserIdAndPhoneNumber(Integer userId, String phoneNumber);

}