package com.bontsi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="branch")
public class Branch {
	@Id @GeneratedValue
	private Long uid;
	private String name;
	private String description;
	private int happyService;

	public Branch() {

	}
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
