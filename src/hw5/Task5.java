package hw5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[20];
        int[] newArrayNumbers = new int[20];

        for (int arrIndex = 0; arrIndex < arrayNumbers.length; arrIndex++) {
            arrayNumbers[arrIndex] = -10 + (int) (Math.random() * 30);
        }
        System.out.println(Arrays.toString(arrayNumbers));



    }
}
