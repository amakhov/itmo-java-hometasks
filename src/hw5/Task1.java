package hw5;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task1 {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[10];

        //  заполнение массива от 1 до 100
        for (int arrIndex = 0; arrIndex < arrayNumbers.length; arrIndex++) {
            arrayNumbers[arrIndex] = 1 + (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arrayNumbers));

        // max
        int maxArray = arrayNumbers[0];

        for (int i : arrayNumbers) {
            if (i > maxArray)
                maxArray = i;
        }
        System.out.println(maxArray);
        // min
        int minArray = arrayNumbers[0];

        for (int i : arrayNumbers) {
            if (i < minArray)
                minArray = i;
        }
        System.out.println(minArray);

        // cреднее арифметическое
        int sum = 0;

        for (int i : arrayNumbers) {
            sum += i;
        }

        System.out.println(sum / arrayNumbers.length);
    }
}
