package main.java.com.kaisahakola.util;

import java.util.Scanner;

public class InputHelper {

    private final Scanner scanner;

    public InputHelper() {
        this.scanner = new Scanner(System.in);
    }

    public int getUserChoice() {
        System.out.println("fix car or buy new? 1 = fix, 2 = buy");
        return scanner.nextInt();
    }
}
