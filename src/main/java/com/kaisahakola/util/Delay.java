package main.java.com.kaisahakola.util;

public class Delay {

    public static void delayAction(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("Delay was interrupted.");
        }
    }
}
