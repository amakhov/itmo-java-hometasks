package hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        int random_number = a + (int) (Math.random() * b);

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число");
            int userNumber = in.nextInt();
            if (userNumber == random_number) {
                System.out.println("Вы угадали!");
                break;
            } else if (userNumber == 0) {
                System.out.println("Выход из программы");
                break;
            } else if ((userNumber < 0) || (userNumber > 9)) {
                System.out.println("Загаданное число в диапозоне от 1 до 9");
            }
            else if (userNumber < random_number) {
                System.out.println("Число больше загаданного");
            }
            else {
                System.out.println("число меньше загаданного");
            }


        }
    }
}
