package com.erpkeshav.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
   
   
	@Id
	public String fullName;
	public String username;
	public String eMail;
	public String password;
	public String confirmPassword;
	public User() {
		super();
	}
	public User(String fullName, String username, String eMail, String password, String confirmPassword) {
		super();
		this.fullName = fullName;
		this.username = username;
		this.eMail = eMail;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", username=" + username + ", eMail=" + eMail + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}
    
}