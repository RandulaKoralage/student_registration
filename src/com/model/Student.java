package com.model;

public class Student {
	private String indexNumber;
	private String name;
	private String telephone;
	private String email;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String indexNumber, String name,String telephone,String email) {
		// TODO Auto-generated constructor stub
	}
	
	public String getIndexNumber() {
		return indexNumber;
	}
	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
