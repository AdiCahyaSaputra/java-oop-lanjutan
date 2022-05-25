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
  }
}
