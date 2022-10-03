package hw5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[]{5, 7, 4, -3, -1, 6, -9, 10, -10};
        int count = 0;

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < 0) {
                count++;
            }
        }
        int[] newArrayNumbers = new int[count];


        for (int i = 0, j = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < 0) {
                newArrayNumbers[j] = arrayNumbers[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(newArrayNumbers));

    }
}
