package LabWork18;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int i = scanner.nextInt();
            System.out.println(7 / i);
        } catch (Exception ex) {
            System.out.println("ArithmeticException was thrown");
        } finally {
            System.out.println("Program terminated");
        }
    }
}
