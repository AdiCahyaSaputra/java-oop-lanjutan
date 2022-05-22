package com.oop.data;

public class Product {
	protected String name;
	protected int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void getPrice() {
		System.out.println(this.price);
	}
}

