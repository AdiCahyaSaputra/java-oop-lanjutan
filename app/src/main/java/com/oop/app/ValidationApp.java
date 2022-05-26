package com.oop.app;

import com.oop.error.ValidationException;
import com.oop.utils.ValidationUtil;

public class ValidationApp {
  public static void main(String[] args) {
    // Errors 
    // ValidationUtil.validate("", null); // karena untuk function yg nge throw Exception harus di tangkap melalui block Try Catch 
  
    String username = "";
    String pw = null;
    
    try {
      ValidationUtil.validate(username, pw);
      System.out.println("Berhasil Login");

    } catch(ValidationException | NullPointerException err) { // Shorthand Multiple Exception 
      System.out.println("Terjadi Error : " + err.getMessage());
    } finally { // biasa nya digunakan untuk read file. try readFile. error or not just close readFile for memory management 
      System.out.println("Tetap dijalankan Walaupun Error");
    }

  }
}
