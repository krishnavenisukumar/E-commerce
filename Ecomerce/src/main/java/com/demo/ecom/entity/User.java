package com.demo.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private Integer userId;
	private String userName;
	private String phoneNumber;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public User(Integer userId, String userName, String phoneNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", phoneNumber=" + phoneNumber + "]";
	}
	
	public User() {
		super();
	}
}
