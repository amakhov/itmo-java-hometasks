package hw2;

public class Task3Random {

    public static void main(String[] args) {
       int count = 666;

       if (count <= 100 && count >= 90) {
           System.out.println("Отлично");
       }
       else if (count <= 89 && count >= 60) {
           System.out.println("Хорошо");
       }
       else if (count <= 59 && count >= 40) {
           System.out.println("Удовлетворительно");
       }
       else if (count >= 0 && count <= 39 ) {
           System.out.println("Попробуйте в следующий раз");
       }
       else {
           System.out.println("Неверный диапозон. Введите от 0 до 100");
       }

    }
}
