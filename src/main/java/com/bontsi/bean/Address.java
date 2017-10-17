package com.bontsi.bean;

public class Address {

	private Long uid;
	private String street;
	private String suburb;
	private String city;
	private long code;
	public Address(Long uid, String street, String suburb, String city, long code) {
		super();
		this.uid = uid;
		this.street = street;
		this.suburb = suburb;
		this.city = city;
		this.code = code;
	}
	public String getCity() {
		return city;
	}
	public long getCode() {
		return code;
	}
	public String getStreet() {
		return street;
	}
	public String getSuburb() {
		return suburb;
	}
	public long getUid() {
		return uid;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}

}
