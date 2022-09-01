package com.java;

public class Jobrecurit {

	String companyName;
	int companyId;
	String companyAddress;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	@Override
	public String toString() {
		return "Jobrecurit [companyName=" + companyName + ", companyId=" + companyId + ", companyAddress="
				+ companyAddress + "]";
	}
	
}
