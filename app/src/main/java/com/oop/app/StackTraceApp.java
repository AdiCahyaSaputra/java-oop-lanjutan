package com.oop.app;

public class StackTraceApp {
  public static void main(String[] args) {
    // StackTrace adalah meng print error beserta baris lokasi error nya 
    /*
    try {
      String[] arr = { "Adi", "Cahya", "Saputra" };
      System.out.println(arr[100]);

    } catch(Throwable throwable) {
      throwable.printStackTrace();
    }
    */

    // Error yg lebih lengkap lagi 
    try {
      errSample();
    } catch(RuntimeException err) {
      err.printStackTrace();
    }
  }
  static void errSample() {
    try {
      String[] arr = { "Adi", "Cahya", "Saputra" };
      System.out.println(arr[100]);

    } catch(Throwable throwable) {
      throw new RuntimeException(throwable);
    }

  }
}
