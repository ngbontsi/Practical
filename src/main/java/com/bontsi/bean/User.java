package com.bontsi.bean;

public class User {

	private int id;
	private String userName;
	private String password1;
	private String email;
	private String phone;
	private String city;

	public String getCity() {
		return city;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getPassword1() {
		return password1;
	}

	public String getPhone() {
		return phone;
	}

	public String getUserName() {
		return userName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
