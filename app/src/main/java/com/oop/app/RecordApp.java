package com.oop.app;

import com.oop.data.LoginRequest;

public class RecordApp {
  public static void main(String[] args) {
    LoginRequest loginReq = new LoginRequest("Adi", "pw123##");
    // getter 
    System.out.println(loginReq.username()); // agak aneh si getter nya wkwkkw 
    System.out.println(loginReq.password());

    // ...
    System.out.println(loginReq);
  }
}
