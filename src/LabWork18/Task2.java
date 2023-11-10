package LabWork18;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String intString = scanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(7 / i);
        } catch (Exception ex) {
            System.out.println("ArithmeticException was thrown");
        } 
    }
}
