package com.hw3.model.dto;

public class Book {
	
	private int num; // 도서 번호
	private String name; // 책 제목
	private String author; // 저자
	private int price; // 가격
	private String publisher; // 출판사
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int num, String name, String author, int price, String publisher) {
		super();
		this.num = num;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "[도서제목 : "+name+" / 도서저자 : "+author+" / 도서가격 : "+price+" / 출판사"+publisher+"]";
	}

}
