package Verion2;

import java.util.Scanner;

public class ConsoleInput {   private Scanner scanner = new Scanner(System.in);

    public int readInt(String msg) {
        System.out.print(msg);
        int input;
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                break;
            } else {
                System.out.print("Invalid input. Try again: ");
                scanner.next();
            }
        }
        return input;
    }

    public double readDouble(String msg) {
        System.out.print(msg);
        double input;
        while (true) {
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                break;
            } else {
                System.out.print("Invalid input. Try again: ");
                scanner.next();
            }
        }
        return input;
    }
}
