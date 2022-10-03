package hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int start = 2, end = 100, middle;

        while (true) {
            middle = (start + end) / 2;
            System.out.println("Число равно " + middle + " ?");
            int answer = in.nextInt();
            if (answer == 1) break;
            System.out.println("Число больше " + middle + " ?");
            answer = in.nextInt();
            if (answer == 1) start = middle;
            else if (answer == 0) end = middle;
        }

    }
}
