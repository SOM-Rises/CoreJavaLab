package com.lab3;

public class Book {

	private String bookname;
	private double price;
	private Author auth;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookname, double price, Author auth) {
		super();
		this.bookname = bookname;
		this.price = price;
		this.auth = auth;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuth() {
		return auth;
	}

	public void setAuth(Author auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "Book : bookname = " + bookname + ", price = " + price;
	}

}
