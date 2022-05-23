package com.oop.data;

public class Cat extends Animal {
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void run() {
		System.out.println("Cat " + this.name + " Running!");
	}
}
