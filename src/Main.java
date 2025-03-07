import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car myCar = new Car();

        startCar(myCar);
        int decision = makeDecision(scanner);
        fixOrBuyNew(myCar, decision);
    }

    public static void startCar(Car myCar) {
        System.out.println(myCar.car);
        System.out.println(myCar.engine);
        System.out.println("oh no car no wörk");
    }

    public static int makeDecision(Scanner scanner) {
        System.out.println("fix car or buy new? 1 = fix, 2 = buy");
        return scanner.nextInt();
    }

    public static void fixOrBuyNew(Car myCar, int decision) {
        if (decision == 1) {
            myCar.fixCar();
            System.out.println(myCar.engine);
            System.out.println("yes now car wörk");
        } else if (decision == 2) {
            myCar.buyNewCar();
            System.out.println(myCar.car);
            System.out.println(myCar.engine);
            System.out.println("yes new car wörk");
        } else {
            System.out.println("wrong decision :(");
        }
    }
}