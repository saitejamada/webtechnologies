package com.javaprograms;

public class Cart {

	int pid;
	String name;
	int price;
	String desc;
	String image;
	int quantity;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Cart(int pid, String name, int price, String desc, String image, int quantity) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.desc = desc;
		this.image = image;
		this.quantity = quantity;
	}
	public Cart() {
		super();
	}
}
