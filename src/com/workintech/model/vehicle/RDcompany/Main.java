package com.workintech.model.vehicle.RDcompany;

public class Main {
    public static void main(String[] args) {
        CarSkeleton carSkeleton = new CarSkeleton("araba", "güzel araba");
        System.out.println(carSkeleton.drive());
        System.out.println(carSkeleton.startEngine());

        ElectricCar electricCar = new ElectricCar("araba", "güzel araba",0.3,300);
        System.out.println(electricCar.drive());
        System.out.println(electricCar.startEngine());

        GasPoweredCar gasPoweredCar= new GasPoweredCar("gazlı", "az yakar", 5.5, 2);
        System.out.println(gasPoweredCar.drive());
        System.out.println(gasPoweredCar.startEngine());

    }
}
