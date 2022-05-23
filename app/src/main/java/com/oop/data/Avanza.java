package com.oop.data;

// multiple implements ( untuk class biasa ) 
public class Avanza implements Car, IsMaintenance {
	public void drive() {
		System.out.println("Driving a car");
	}

	public void turnRight() {
		System.out.println("Car turn Right");
	}

	public void turnLeft() {
		System.out.println("Car turn Left");
	}

	public void stop() {
		System.out.println("Stop a car");
	}

	// waijib ngisi getBrand gara² si car inheritance ke si HasBrand 
	public String getBrand() {
		return "Avanza";
	}

	public boolean isMaintenance() {
		return false;
	}
}
