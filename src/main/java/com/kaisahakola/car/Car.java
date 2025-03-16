package main.java.com.kaisahakola.car;

import main.java.com.kaisahakola.vehicle.Vehicle;

public class Car extends Vehicle {
    private String car = "hello im car";
    private String engine = "* köh köh *";

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void fixCar() {
        System.out.println("lets fix");
        setEngine("* vrum vrum *");
    }

    public void buyNewCar() {
        System.out.println("* cha-ching *");
        setCar("hi im new car");
        setEngine("* vrumm vrumm *");
    }
}
