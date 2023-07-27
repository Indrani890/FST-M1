package activities;
import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        int[] number = {10, 77, 10, 55, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(number));

        int searchNum = 10;
        result(number, searchNum);

    }

    public static void result(int[] n, int searchNum) {
        int total = 0;
        for (int no : n) {
            if (no == 10) {
                total += searchNum;
                System.out.println("total " + total);
            }
            System.out.println("Original number: " + no);
            if (total > 30) {

                break;
            }
        }
    }
}

