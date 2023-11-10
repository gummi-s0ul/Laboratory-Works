package LabWork1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter number: ");
                arr[i] = scanner.nextInt();
            }
        }
        
        int arrLen = arr.length - 1;

        int arrSum = 0;
        int minElem = Integer.MAX_VALUE;
        int maxElem = 0;

        while (arrLen >= 0) {
            int elem = arr[arrLen];

            arrSum += elem;

            if (elem < minElem) {
                minElem = elem;
            }
            if (elem > maxElem) {
                maxElem = elem;
            }

            arrLen -= 1;
        }

        System.out.println("Sum of array: " + arrSum);
        System.out.println("Min number: " + minElem);
        System.out.println("Max number: " + maxElem);
    }
}
