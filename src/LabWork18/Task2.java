package LabWork18;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            String intString = scanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(7 / i);
        } catch (Exception ex) {
            System.out.println("ArithmeticException was thrown");
        } finally {
            scanner.close();
        }
    }
}
