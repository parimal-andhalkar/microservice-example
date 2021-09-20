package com.contact.pojo;

public class Contact {

	int id;
	String mobile;
	String email;
	int userId;
	
	
	
	public Contact() {
		
	}
	public Contact(int id, String mobile, String email, int userId) {
		
		this.id = id;
		this.mobile = mobile;
		this.email = email;
		this.userId = userId;
	}
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
	
	
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", mobile=" + mobile + ", email=" + email + ", userId=" + userId + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	
}
