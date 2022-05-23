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

	// Override method toString() yaitu method yg terpanggil saat kita printout kelas ini ke console 
	public String toString() {
		return "Product name: " + this.name + ", price: " + this.price;
	}

	// Override method equals untuk validasi 
	public boolean equals(Object o) {
		if(this == o) return true; // jika tempat nyimpen di memori dari kelas this == o maka object nya sama 
		if(!(o instanceof Product)) return false; // karena instanceof nya bukan product udh pasti false 
		
		Product product = (Product) o; // Casting class 
		if(price != product.price) return false; // si price primitif btw inget yah 

		// name itu non primitif jadi pake equals nge bandingin nya 
		return name != null && name.equals(product.name);
	}
}

