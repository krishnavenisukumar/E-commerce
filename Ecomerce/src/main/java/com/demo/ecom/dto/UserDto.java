package com.demo.ecom.dto;

import java.util.Optional;

import com.demo.ecom.entity.User;

public class UserDto {
	
	private Integer userId;
	private String userPassword;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserDto() {
		super();
	}


}
