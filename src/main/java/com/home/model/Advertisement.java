package com.home.model;

import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "advertisement")
public class Advertisement {
	


	private boolean      active;
	@Id
	private String       name;	
	private String       state;	
	private String       area;	
	private Date         dateOfPost	;
	private int          pinCode;	
	private String       propertyType;	
	
	
	
	public Advertisement() {}



//	public int getId() {
//		return id;
//	}
//
//
//
//	public void setId(int id) {
//		this.id = id;
//	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	public Date getDateOfPost() {
		return dateOfPost;
	}



	public void setDateOfPost(Date dateOfPost) {
		this.dateOfPost = dateOfPost;
	}



	public int getPinCode() {
		return pinCode;
	}



	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}



	public String getPropertyType() {
		return propertyType;
	}



	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	
	public Advertisement(String name, String state, String area, Date dateOfPost, int pinCode, String propertyType) {
		super();
		this.name = name;
		this.state = state;
		this.area = area;
		this.dateOfPost = dateOfPost;
		this.pinCode = pinCode;
		this.propertyType = propertyType;
	}



	public Advertisement(String name2, String area2, String state2, int pinCode2, Date dateOfPost2) {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Advertisement [ active=" + active + ", name=" + name + ", state=" + state + ", area="
				+ area + ", dateOfPost=" + dateOfPost + ", pinCode=" + pinCode + ", propertyType=" + propertyType + "]";
	}


}
