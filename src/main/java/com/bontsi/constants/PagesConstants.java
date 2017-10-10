package com.bontsi.constants;

public enum PagesConstants {

	User_Id("userid"),
	Password("pwd"),
	FirstName("firstname"),
	MiddleName("middlename"),
	LastName("lastname"),
	Email("email"),
	Login_page("login.jsp"),
	Error_page("error.jsp"),
	Home_page("home.jsp"),
	Register_page("register.jsp"),
	Logout_page("logout.jsp");

	String value;
	private PagesConstants(String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
}
