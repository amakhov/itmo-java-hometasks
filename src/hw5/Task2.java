package hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[10];

        for (int i = 20, j = 0; i > 0; i -= 2) {
            arrayNumbers[j] = i;
            j++;
        }
        System.out.println(Arrays.toString(arrayNumbers));

    }
}