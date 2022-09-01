package com.pojo;

public class Book {

	int bid;
	String bookname;
	int price;
	String authour;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookname=" + bookname + ", price=" + price + ", authour=" + authour + "]";
	}
	
}
