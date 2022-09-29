package com.lab3;

public class Bookslist {

	static void display(Author a, Book b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author a1 = new Author("Humayun Ahmed", "Bangladesh");
		Book b1 = new Book("Misir Ali", 150.50, a1);

		Author a2 = new Author("Bibhutibhushan Bandyopadhyay", "North 24 Parganas");
		Book b2 = new Book("Pather Panchali", 500.50, a2);

		Author a3 = new Author("Paulo Coelh0", "The Alchemist");
		Book b3 = new Book("Misir Ali", 150.50, a3);

		display(a1, b1);
		display(a2, b2);
		display(a3, b3);
	}

}
