package com.demo.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.ecom.dao.UserDAO;
import com.demo.ecom.entity.User;



@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDAO;

	public Optional<User> getByUserIdAndPhoneNumber(Integer userId, String phoneNumber) {
		return userDAO.findByUserIdAndPhoneNumber(userId, phoneNumber);
	}

	
}