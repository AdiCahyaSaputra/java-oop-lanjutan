package com.oop.app;

import com.oop.data.HelloWorld;

public class HelloWroldApp { // sorry typo nama file wkwkwk 
  public static void main(String[] args) {
    // harus nya kan kita nge polymorphism in kelas implements dari kelas interface nya kan, tapi.. 
    // kita bisa pake anonymous class 
    HelloWorld english = new HelloWorld() {
      // override method interface : 
      public void sayHai() {
        System.out.println("Hai");
      }

      public void sayHai(String name) {
        System.out.println("Hai " + name);
      }
    };

    english.sayHai();
    english.sayHai("Adi");
  }
}
