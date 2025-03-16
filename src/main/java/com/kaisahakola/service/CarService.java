package main.java.com.kaisahakola.service;

import main.java.com.kaisahakola.car.Car;

public class CarService {

    public void startCar(Car myCar) {
        System.out.println(myCar.getCar());
        System.out.println(myCar.getEngine());
        System.out.println("oh no car no wörk");
    }

    public void makeDecision(Car myCar, int decision) {
        if (decision == 1) {
            myCar.fixCar();
            System.out.println(myCar.getEngine());
            System.out.println("yes now car wörk");
        } else if (decision == 2) {
            myCar.buyNewCar();
            System.out.println(myCar.getCar());
            System.out.println(myCar.getEngine());
            System.out.println("yes new car wörk");
        } else {
            System.out.println("wrong decision :(");
        }
    }
}
