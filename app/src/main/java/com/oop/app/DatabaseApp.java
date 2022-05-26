package com.oop.app;

import com.oop.error.DatabaseError;

public class DatabaseApp {
  public static void main(String[] args) {
    dbConnect("Adi", "oop"); // g perlu di try catch karena emang rekomendasi nya, ya langsung off in aplikasi nya klo emang error jenis begini an 
    System.out.println("Koneksi berhasil");
  }

  static void dbConnect(String host, String db) {
    if(host != "localhost" || db != "oop") throw new DatabaseError("Koneksi Gagal");
  }
}
