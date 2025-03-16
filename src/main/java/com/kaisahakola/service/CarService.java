package main.java.com.kaisahakola.service;

import main.java.com.kaisahakola.car.Car;
import main.java.com.kaisahakola.util.Delay;

public class CarService {

    public void startCar(Car myCar) {
        System.out.println(myCar.getCar());

        Delay.delayAction(1000);
        System.out.println(myCar.getEngine());

        Delay.delayAction(1000);
        System.out.println("oh no car no wörk");
    }

    public void makeDecision(Car myCar, int decision) {
        if (decision == 1) {
            myCar.fixCar();

            Delay.delayAction(1000);
            System.out.println(myCar.getEngine());

            Delay.delayAction(1000);
            System.out.println("yes now car wörk");

            Delay.delayAction(1000);
            myCar.honk();
        } else if (decision == 2) {
            myCar.buyNewCar();

            Delay.delayAction(1000);
            System.out.println(myCar.getCar());

            Delay.delayAction(1000);
            System.out.println(myCar.getEngine());

            Delay.delayAction(1000);
            System.out.println("yes new car wörk");

            Delay.delayAction(1000);
            myCar.honk();
        } else {
            System.out.println("wrong decision :(");
        }
    }
}
