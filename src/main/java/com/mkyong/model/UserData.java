package com.mkyong.model;

import org.springframework.stereotype.Repository;
@Repository
public class UserData {
	
	private String username;

	 private String password;
	 private boolean valid;
	 
	 public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
