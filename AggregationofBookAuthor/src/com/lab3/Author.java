package com.lab3;

public class Author {

	private String authorName;
	private String place;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String authorName, String place) {
		super();
		this.authorName = authorName;
		this.place = place;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Author : authorName = " + authorName + ", place = " + place;
	}

}
