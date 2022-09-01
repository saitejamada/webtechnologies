package com.java;

public class Search {

	String name;
	long mobilenumber;
	int age;
	String qualifiaction;
	int marks;
	byte[] resume;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualifiaction() {
		return qualifiaction;
	}
	public void setQualifiaction(String qualifiaction) {
		this.qualifiaction = qualifiaction;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public byte[] getResume() {
		return resume;
	}
	public void setResume(byte[] byteArray) {
		this.resume = byteArray;
	}
	@Override
	public String toString() {
		return "Search [name=" + name + ", mobilenumber=" + mobilenumber + ", age=" + age + ", qualifiaction="
				+ qualifiaction + ", marks=" + marks + ", resume=" + resume + "]";
	}
	
}
