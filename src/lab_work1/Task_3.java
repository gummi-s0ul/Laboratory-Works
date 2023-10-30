package lab_work1;

public class Task_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        System.out.println("Sum of array elements: " + arrSum);
        System.out.println("Arithmetic mean: " + arrSum / arr.length);
    }
}
