package com.oop.data;

import java.lang.annotation.*;

// untuk metadata 
@Retention(value = RetentionPolicy.RUNTIME) // masih ada g pas di compile ? 
@Target(value = {ElementType.TYPE}) // anotation nya bisa di pake dimana 

public @interface Anotation {
	String name(); // property di anotation 
	String[] tags() default {}; // default value di property anotation 
}

// metadata nya bisa di taro di mana pun sesuai @Target 
