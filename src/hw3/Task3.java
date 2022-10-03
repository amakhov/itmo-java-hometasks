package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во тарелок: ");
        int plate = in.nextInt();
        System.out.println("Введите моющиеся средство: ");
        double washer = in.nextDouble();

        while (plate > 0) {
            plate--;
            washer-=0.5;
            if (washer < 0.5) {
                System.out.println("Закончилось моющиеся средство");
                break;
            }
            System.out.println(washer);

        }

    }
}