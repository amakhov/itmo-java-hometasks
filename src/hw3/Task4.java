package hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        int random_number = a + (int) (Math.random() * b);
        Scanner in = new Scanner(System.in);

        int count = 3;
        while (true) {

            System.out.println("Введите число");
            System.out.println("Осталось " + count + " попыток!");
            int userNumber = in.nextInt();

            count--;
            System.out.println("Осталось " + count + " попыток!");
            if (count == 0) {
                System.out.println("Вы проиграли!");
                break;
            }

            if (userNumber == random_number) {
                System.out.println("Вы угадали!");
                break;
            }
            if (userNumber == 0) {
                System.out.println("Выход из программы");
                break;
            }
            if ((userNumber < 0) || (userNumber > 9)) {
                System.out.println("Загаданное число в диапозоне от 1 до 9");
            }
            if (userNumber < random_number) {
                System.out.println("Число больше загаданного");
            }
            else {
                System.out.println("число меньше загаданного");
            }
            if (count == 0) {
                    System.out.println("Вы проиграли!");
                }

        }
    }
}
