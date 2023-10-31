package LabWork18;

public class Task1 {
    public static void main(String[] args) {
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException ex) {
            System.out.println("Attempted division by zero");
        }
    }
}
