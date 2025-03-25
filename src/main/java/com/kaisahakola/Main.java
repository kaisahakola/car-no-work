package main.java.com.kaisahakola;

import main.java.com.kaisahakola.car.Car;
import main.java.com.kaisahakola.service.CarService;
import main.java.com.kaisahakola.util.InputHelper;


public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        CarService carService = new CarService();
        InputHelper inputHelper = new InputHelper();

        carService.startCar(myCar);
        int decision = inputHelper.getUserChoice();
        carService.makeDecision(myCar, decision);

        inputHelper.close();
    }
}
