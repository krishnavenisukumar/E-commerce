package com.demo.ecom.response;

public class Message {

	private String statusCode;
	private String statusmessage;

	public Message() {
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return statusmessage;
	}

	public void setMessage(String statusmessage) {
		this.statusmessage = statusmessage;
	}
}