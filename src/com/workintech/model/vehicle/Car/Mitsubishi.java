package com.workintech.model.vehicle.Car;

public class Mitsubishi  extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi engine starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi is accelarating";
    }

    @Override
    public String brake() {
        return "Mitsubishi is breaking";
    }


}
