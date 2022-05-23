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
	// method default : sunnah untuk di override di semua kelas implements nya 
	default boolean isBig() {
		return false;
	}
}
