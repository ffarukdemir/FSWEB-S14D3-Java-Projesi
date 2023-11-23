package com.workintech.model.vehicle.Car;

public class Ford extends Car {

  public Ford(int cylinders, String name) {
   super(cylinders, name);
  }
  @Override
  public String startEngine() {
   return "Ford engine starting";
  }

  @Override
  public String accelerate() {
   return "Ford is accelarating";
  }

  @Override
  public String brake() {
   return "Ford is breaking";
  }
 }
