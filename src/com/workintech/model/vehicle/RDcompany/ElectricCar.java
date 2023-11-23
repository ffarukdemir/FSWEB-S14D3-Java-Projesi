package com.workintech.model.vehicle.RDcompany;

public class ElectricCar extends CarSkeleton{

    private double avgKmPerCarge;

    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCarge, int batterySize) {
        super(name, description);
        this.avgKmPerCarge = avgKmPerCarge;
        this.batterySize = batterySize;
    }


    public String startEngine() {
        return  "Electriccar engine started";
    }

    @Override
    public String drive() {
        return "Electriccar is driving";
    }


}
