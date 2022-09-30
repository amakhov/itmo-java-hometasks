package hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int userNumber = in.nextInt();
        int sumNumber = 0;
        while (userNumber != 0) {
            sumNumber += (userNumber % 10);
            userNumber /= 10;
        }
        System.out.println(sumNumber);
    }
}
