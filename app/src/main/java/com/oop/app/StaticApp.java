package com.oop.app;

import com.oop.data.Application;
import com.oop.data.Constant;
import com.oop.data.Country;
import com.oop.utils.MathUtil;

public class StaticApp {
  public static void main(String[] args) {
    // Memanggil static property 
    System.out.println(Constant.APPLICATION);
    System.out.println(Constant.PROGRESS);

    // Memanggil method static 
    System.out.println(MathUtil.sum(6,9,8,10,7,3));

    // Menginisialisasi static inner class 
    Country.City jakarta = new Country.City();
    jakarta.setName("Jakarta");

    System.out.println(jakarta.getName());

    // static block 
    System.out.println(Application.PROCECORS);
  }
}
