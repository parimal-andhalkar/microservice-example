package com.user.pojo;

public class Contact {

	int id;
	String mobile;
	String email;
	String userId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", mobile=" + mobile + ", email=" + email + ", userId=" + userId + "]";
	}
	
	
	
	
}
