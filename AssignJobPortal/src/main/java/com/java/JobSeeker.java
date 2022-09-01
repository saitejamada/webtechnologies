package com.java;

import java.io.InputStream;
import java.sql.Blob;

public class JobSeeker {

	String name;
	long mobilenumber;
	int age;
	String qualifiaction;
	int marks;
	InputStream resume;
	
	@Override
	public String toString() {
		return "JobSeeker [name=" + name + ", mobilenumber=" + mobilenumber + ", age=" + age + ", qualifiaction="
				+ qualifiaction + ", marks=" + marks + ", resume=" + resume + "]";
	}
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
	public InputStream getResume() {
		return resume;
	}
	public void setResume(InputStream is) {
		this.resume = is;
	}
	
}
