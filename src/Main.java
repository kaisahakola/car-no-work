import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car myCar = new Car();

        System.out.println(myCar.car);
        System.out.println(myCar.engine);
        System.out.println("oh no car no wörk");

        System.out.println("fix car or buy new? 1 = fix, 2 = buy");
        int decision = scanner.nextInt();

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