package hw5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String arrString = "в предложении все слова разной длины";
        String [] words = arrString.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        int len = 0;
        String longer = "";
        for (String i : words) {
            if (i.length() > len) {
                len = i.length();
                longer = i;
            }
        }
        System.out.println(longer);


    }
}
