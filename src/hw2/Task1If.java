package hw2;

public class Task1If {
    public static void main(String[] args) {
        int month = 0;
        if ((month < 3 && month > 0) || month == 12) System.out.println("Зима");
        else if (month > 2 && month < 6) System.out.println("Весна");
        else if (month > 5 && month < 9) System.out.println("Лето");
        else if (month > 8 && month < 12) System.out.println("Осень");
        else System.out.println("Введите число от 1 до 12");

    }
}
