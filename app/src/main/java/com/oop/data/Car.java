package com.oop.data;

// inheritance di interface wkwkkw  ( bisa inheritance lebih dari satu btw ) 
public interface Car extends HasBrand {
	// boleh punya field tapi harus final 
	// method otomatis abstract method 
	void drive();
	void turnLeft();
	void turnRight();
	void stop();
	boolean isMaintenance(); // kalo nggak error wkwkwk, soal nya di polymorphism in nya ke kelas car 
}
