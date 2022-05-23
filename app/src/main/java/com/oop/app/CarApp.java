package com.oop.app;

import com.oop.data.Avanza;
import com.oop.data.Car;

public class CarApp {
  public static void main(String[] args) {
    Car avanza = new Avanza();
    avanza.drive();
    avanza.turnRight();
    avanza.turnLeft();
    avanza.stop();
    System.out.println(avanza.getBrand());
    System.out.println(avanza.isMaintenance());
  }
}
