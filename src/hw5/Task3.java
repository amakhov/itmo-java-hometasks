package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
         String[] arrString = new String[10];
         Scanner enter = new Scanner(System.in);

        for (int i = 0; i < arrString.length; i++) {
            System.out.println("ВВедите слово");
            String userWord = enter.nextLine();;
            if (userWord.equalsIgnoreCase("exit")) break;
            for (String j : arrString) {
                if (userWord.equalsIgnoreCase(j)) {
                    i--;
                    break;
                }
                if (j == null) {
                    arrString[i] = userWord;
                }

             }
        }

        System.out.println(Arrays.toString(arrString));
    }
}
