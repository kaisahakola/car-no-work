public class Car {
    String car = "hello im car";
    String engine = "köh köh";

    public void fixCar() {
        System.out.println("lets fix");
        this.engine = "vrumm vrumm";
    }

    public void buyNewCar() {
        System.out.println("cha-ching");
        this.car = "hi im new car";
        this.engine = "vrumm vrumm";
    }
}
