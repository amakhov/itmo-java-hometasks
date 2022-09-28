package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во тарелок: ");
        int plate = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите моющиеся средство: ");
        int washer = in1.nextInt();

        double remain = 0;
        while (plate > 0) {
            plate--;
            remain = washer - 0.5;
            washer-=0.5;
            if (remain < 0) {
                System.out.println("Закончилось моющиеся средство");
                break;
            }
            System.out.println(remain);

        }

    }
}
