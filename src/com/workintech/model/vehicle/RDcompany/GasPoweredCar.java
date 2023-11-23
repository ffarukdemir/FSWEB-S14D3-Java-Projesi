package com.workintech.model.vehicle.RDcompany;

public class GasPoweredCar extends CarSkeleton {

    private double avarageKmPerLiter;
    private int cylinder;

    public GasPoweredCar(String name, String description, double avarageKmPerLiter, int cylinder) {
        super(name, description);
        this.avarageKmPerLiter = avarageKmPerLiter;
        this.cylinder = cylinder;
    }

    @Override
    public String startEngine() {
        return  "Gaspowered engine started";
    }

    @Override
    public String drive() {
        return "Gaspowered is driving";
    }


}
