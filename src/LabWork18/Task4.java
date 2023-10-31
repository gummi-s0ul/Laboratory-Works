package LabWork18;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = scanner.nextInt();
        try {
            System.out.println(7 / i);
        } catch (Exception ex) {
            System.out.println("ArithmeticException was thrown");
        } finally {
            scanner.close();
            System.out.println("Program terminated");
        }
    }
}
