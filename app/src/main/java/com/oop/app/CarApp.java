package com.oop.app;

import com.oop.data.Avanza;
import com.oop.data.Bus;
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

    Car bus = new Bus();
    bus.drive();
    bus.turnLeft();
    bus.turnRight();
    bus.stop();
    System.out.println(bus.getBrand());
    System.out.println(bus.isMaintenance());
    System.out.println(bus.isBig());
  }
}
