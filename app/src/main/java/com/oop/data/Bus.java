package com.oop.data;

public class Bus implements Car {
	public void drive() {
		System.out.println("Bus is driving");
	}

	public void turnRight() {
		System.out.println("Bus Turn Right");
	}

	public void turnLeft() {
		System.out.println("Bus Turn Left");
	}

	public void stop() {
		System.out.println("Bus stop");
	}

	public boolean isMaintenance() {
		return true;
	}

	public String getBrand() {
		return "Tayo";
	}
	
	// Override default method 
	public boolean isBig() {
		return true;
	}
}
