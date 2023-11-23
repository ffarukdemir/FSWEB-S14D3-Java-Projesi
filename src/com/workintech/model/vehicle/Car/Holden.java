package com.workintech.model.vehicle.Car;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden engine starting";
    }

    @Override
    public String accelerate() {
        return "Holden is accelarating";
    }

    @Override
    public String brake() {
        return "Holdne is breaking";
    }
}
