package LabWork3MathAndRandom;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        RandomGeneration randomGeneration = new RandomGeneration();

        randomGeneration.mathRandom();

        randomGeneration.classRandom();
    }

    static class RandomGeneration {
        public void mathRandom() {
            double[] array = new double[10];

            for (int i = 0; i < array.length; i++) {
                array[i] = Math.random() * 100;
            }

            System.out.println("Array with Math.random(): " + Arrays.toString(array));
            System.out.println("");

            Arrays.sort(array);

            System.out.println("Sorted array with Math.random(): " + Arrays.toString(array));
            System.out.println("");
        }

        public void classRandom() {
            double[] array = new double[10];

            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextDouble() * 100;
            }

            System.out.println("Array with Random class: " + Arrays.toString(array));
            System.out.println("");

            Arrays.sort(array);

            System.out.println("Sorted array with Random class: " + Arrays.toString(array));
            System.out.println("");
        }
    }
}

