package com.oop.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
  public static void main(String[] args) {
    BufferedReader reader = null;

    try {
      reader = new BufferedReader(
          new FileReader("README.md")
      );
      while(true) {
        String line = reader.readLine();

        if(line == null) { // udh di akhir baris 
          break;
        }

        System.out.println(line);
      }      
    } catch(Throwable throwable) {
      System.out.println("Error membaca File " + throwable.getMessage());
    } finally {
      if(reader != null) {
        try {
          reader.close();
          System.out.println("Berhasil Nge Close Reader");
        } catch(IOException exception) {
          System.out.println("Error nya ribet bet dah : " + exception.getMessage());
        }
      }
    }

    // try with resource ( lebih singkat ) 
    try(BufferedReader reader2 = new BufferedReader(new FileReader("README.md"))) {
      while(true) {
        String line2 = reader2.readLine();
        if(line2 == null) break;

        System.out.println(line2);
      }
    } catch(IOException err) {
      err.printStackTrace();
    }
  }
}
