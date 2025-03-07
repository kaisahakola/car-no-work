public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.car);
        System.out.println(myCar.engine);
        System.out.println("oh no car no wörk");
        myCar.fixCar();
        System.out.println(myCar.engine);
        System.out.println("yes now car wörk");
    }
}