package activities;
import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int[] numbers = {9, 5, 2, 7, 1, 8, 3}; // Array with numbers in random order

        System.out.println("Array before sorting: " + Arrays.toString(numbers));

        // Insertion sort
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }

            numbers[j + 1] = key;
        }

        System.out.println("Array after sorting: " + Arrays.toString(numbers));
    }
}
