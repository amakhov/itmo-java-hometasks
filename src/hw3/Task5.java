package hw3;

public class Task5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 100;
        int user_number = a + (int) (Math.random() * b);
        if (user_number < 2 || user_number > 100) {
            System.out.println("Диапозон от 2 до 100. ВВедите число в указаном диапозоне!");
        }
    }
}
