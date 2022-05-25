package com.oop.app;

import com.oop.data.Customer;
import com.oop.data.Level;

public class CustomerApp {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setName("Adi");
    customer.setLevel(Level.PREMIUM);

    System.out.println(customer.getName());
    System.out.println(customer.getLevel());

    System.out.println(customer.getLevel().getDesc());


    // Enum ke String 
    String enumString = Level.PREMIUM.name();
    // String ke Enum 
    Level level2 = Level.valueOf("PREMIUM");

    // list of all enum 
    Level[] allEnum = Level.values();

    System.out.println(enumString);
    System.out.println(level2);

    for(Level enumLevel : allEnum) {
      System.out.println(enumLevel);
    }

  }
}
