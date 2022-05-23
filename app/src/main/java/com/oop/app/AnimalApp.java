package com.oop.app;
import com.oop.data.Cat;
import com.oop.data.Animal;

public class AnimalApp {
  public static void main(String[] args) {
    // Polymorphism hehe 
    Animal cat = new Cat();
    cat.setName("Adi"); // walaupun ini instance cat tapi tetep ngambil dari method parent ( mau g mau overriding atau ya method abstract ini ) 
    cat.run();
    System.out.println(cat.getName());
  }
}
