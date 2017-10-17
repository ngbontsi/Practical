package com.bontsi.bean;

public class Branch {

	private Long uid;
	private String name;
	private String description;
	private int happyService;
	public Branch(Long uid, String name, String description, int happyService) {
		super();
		this.uid = uid;
		this.name = name;
		this.description = description;
		this.happyService = happyService;
	}
	public String getDescription() {
		return description;
	}
	public int getHappyService() {
		return happyService;
	}
	public String getName() {
		return name;
	}
	public long getUid() {
		return uid;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setHappyService(int happyService) {
		this.happyService = happyService;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}

}
