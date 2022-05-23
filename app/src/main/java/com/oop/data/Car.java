package com.oop.data;

public interface Car {
	// boleh punya field tapi harus final 
	// method otomatis abstract method 
	void drive();
	void turnLeft();
	void turnRight();
	void stop();
}
