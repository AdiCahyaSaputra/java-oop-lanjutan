package com.oop.data;

public abstract class Animal {
	protected String name;

	// seolah olah memaksa child class untuk meng override method abstract ini 
	public abstract void run(); // tidak mengisi function nya. isi di child class 
	public abstract void setName(String name);
	public abstract String getName();
}
