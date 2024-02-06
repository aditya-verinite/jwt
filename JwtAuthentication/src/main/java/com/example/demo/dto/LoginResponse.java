package com.example.demo.dto;

public class LoginResponse {

	private String jwt;

	public LoginResponse(String jwt) {
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	// You can add other methods as needed

	@Override
	public String toString() {
		return "LoginResponse{" + "jwt='" + jwt + '\'' + '}';
	}
}