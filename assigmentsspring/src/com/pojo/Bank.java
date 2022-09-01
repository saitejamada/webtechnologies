package com.pojo;

public class Bank {

	long bacno;
	String bankname;
	String holdername;
	String address;
	int accountbalance;
	public long getBacno() {
		return bacno;
	}
	public void setBacno(long bacno) {
		this.bacno = bacno;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	@Override
	public String toString() {
		return "Bank [bacno=" + bacno + ", bankname=" + bankname + ", holdername=" + holdername + ", address=" + address
				+ ", accountbalance=" + accountbalance + "]";
	}
	
}
