package com.bontsi.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="USER_TABLE")
public class User implements Serializable{

	@Id @GeneratedValue
	private Long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String userId;
	private String password;

	public User() {
	}


	public User(String firstName, String middleName, String lastName, String email, String userId, String password) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.userId = userId;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public Long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getPassword() {
		return password;
	}

	public String getUserId() {
		return userId;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
