package com.customer.bean;

import java.util.Objects;

public class Customer {

	int cid;
	String name;
	long mobileno;
	String address;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer() {
		super();
	}
	public Customer(int cid, String name, long mobileno, String address) {
		super();
		this.cid = cid;
		this.name = name;
		this.mobileno = mobileno;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", mobileno=" + mobileno + ", address=" + address + "]";
	}
	
}
