package com.cg.rest.restservice.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int flatNo;
	private String name;
	private String street;
	private String city;
	private int pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", name=" + name + ", street=" + street + ", city=" + city + ", pincode="
				+ pincode + "]";
	}
	
	
	
}
