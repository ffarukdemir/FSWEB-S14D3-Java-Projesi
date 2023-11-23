package com.workintech.model.vehicle.RDcompany;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine(){
        return "CarSkeletons engine is startign";
    }

    public String drive(){
        runEngine();
        return "CarSkeletons engine is driving";
    }

    protected void runEngine(){
        System.out.println("CarSkeletons engine is running");
    }

    protected void runEngine(ElectricCar electricCar){

        System.out.println("ElectricCar engine is running");
    }
    protected void runEngine(GasPoweredCar gasPoweredCar){

        System.out.println("gaspowered engine is running" + gasPoweredCar);
    }

    protected void runEngine(HybridCar hybridCar){

        System.out.println("hybridcar engine is running");
    }

}
