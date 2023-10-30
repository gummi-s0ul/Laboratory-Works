package lab_work3_math_and_random;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.print("Array: " + Arrays.toString(array));
        System.out.println();

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                System.out.println("The array is not ascending");
                return;
            }
        }

        System.out.println("The array is ascending");
    }
}
