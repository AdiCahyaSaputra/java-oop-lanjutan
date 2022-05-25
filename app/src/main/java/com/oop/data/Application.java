package com.oop.data;

public class Application {
	public static final int PROCECORS;

	// static block ( constructer lah ya gampang nya mah ) 
	static {
		System.out.println("Mengakses Static Block");
		// di static g bisa pake this btw 
		PROCECORS = Runtime.getRuntime().availableProcessors();
	}
}
