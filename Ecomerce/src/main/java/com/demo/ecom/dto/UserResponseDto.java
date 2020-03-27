package com.demo.ecom.dto;

public class UserResponseDto {

	Integer displayCode;
	String displayMessage;

	public UserResponseDto() {
		super();

	}

	public Integer getDisplayCode() {
		return displayCode;
	}

	public void setDisplayCode(Integer displayCode) {
		this.displayCode = displayCode;
	}

	public String getDisplayMessage() {
		return displayMessage;
	}

	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}

	public UserResponseDto(Integer displayCode, String displayMessage) {
		super();
		this.displayCode = displayCode;
		this.displayMessage = displayMessage;
	}

}