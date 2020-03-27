package com.demo.ecom.dto;

public class UserDto {

	private Integer userId;
	private String phoneNumber;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public UserDto() {
		super();
	}

}