package com.softserve.edu06.practical.task1;

public class Sedan extends Car {

    /*Order must be, first fields after constructor and after that methods, in class Truck the same*/

    @Override
    public void run() {
        System.out.println(model + " Start engine, push accelerator up to " + maxSpeed + "km/h");
    }

    @Override
    public void stop() {
        System.out.println(model + " Push break, stop engine\n");
    }

    public Sedan() {
    }

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "BodyType: Sedan, Model: " + model +  ", Maximum speed: " + maxSpeed +
                "km/h, Year of Manufacture: " + yearOfManufacture + ".";
    }
}
