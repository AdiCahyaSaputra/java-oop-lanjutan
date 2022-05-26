package com.oop.error;

// Exception. wajib extends very super class yaitu Throwable 
public class ValidationException extends Throwable {
	/*
	private String message;

	public ValidationException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}
	*/

	// atau 
	public ValidationException(String message) {
		super(message); // karena di class Throwable udh ada constructer yg ngitu in message 
	}
}
