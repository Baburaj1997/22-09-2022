package com.inheritance.bll;

public class Book {
	private String isbn;
	private String name;
	private Author Author;
	private double price;
	private int qty;
	
	public Book(String isbn, String name, Author author, double price) {
		super();
		this.isbn = isbn;
		this.name = name;
		Author = author;
		this.price = price;
	}

	public Book(String isbn, String name, Author author, double price, int qty) {
		super();
		this.isbn = isbn;
		this.name = name;
		Author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return Author;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book \n [\n isbn=" + isbn + ", \n name=" + name + ",\n Author=" + Author + ",\n price=" + price + ",\n qty=" + qty
				+ "\n]";
	}
	
	
	

}
