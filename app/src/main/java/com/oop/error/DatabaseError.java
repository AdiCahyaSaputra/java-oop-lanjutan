package com.oop.error;

// jenis error lagi ( yg direkomendasikan untuk men stop aplikasi nya setelah dapat error ini ) 
public class DatabaseError extends Error {
	public DatabaseError(String message) {
		super(message);
	}
}
