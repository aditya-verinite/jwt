package com.example.demo.dto;

public class HelloResponse {
	private String message;

	public HelloResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// You can add other methods as needed

	@Override
	public String toString() {
		return "HelloResponse{" + "message='" + message + '\'' + '}';
	}
}