package com.home.model;

public class SignUp {
	private String firstname;

	private String lastname;

	private String email;

	private String newpassword;
	
	SignUp(){}
	
	

	public SignUp(String firstname, String lastname, String email, String newpassword) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.newpassword = newpassword;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	
	
}
