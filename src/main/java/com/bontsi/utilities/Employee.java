package com.bontsi.utilities;

import java.util.concurrent.atomic.AtomicLong;

public class Employee {

	private static final AtomicLong counter = new AtomicLong(100);

	public static AtomicLong getCounter() {
		return counter;
	}

	private long id;

	private String name;

	private String lastName;

	private String birthDate;

	private String role;

	private String department;

	private String email;

	public Employee(String name, String lastName, String birthDate, String role, String department, String email) {
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.role = role;
		this.department = department;
		this.email = email;
		id = counter.incrementAndGet();
	}

	public Employee(String name, String lastName, String birthDate, String role, String department, String email, long id) {
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.role = role;
		this.department = department;
		this.email = email;
		this.id = id;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public String getDepartment() {
		return department;
	}

	public String getEmail() {
		return email;
	}

	public long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
