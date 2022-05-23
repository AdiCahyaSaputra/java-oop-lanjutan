package com.oop.app;

import com.oop.data.Product;

public class ProductApp {
	public static void main(String[] args) {
		Product redmi = new Product("Redmi Note 4x", 2_000_000);
		redmi.getPrice();

		System.out.println(redmi); // secara otomatis memanggil .toString() 

		Product redmi2 = new Product("Redmi Note 4x", 2_000_000);
		System.out.println(redmi.equals(redmi2)); // harus nya true karena tadi udh di Override 
	}
}
