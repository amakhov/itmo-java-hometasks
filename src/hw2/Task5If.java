package hw2;

public class Task5If {
    public static void main(String[] args) {
        int age = 100, exp = 7;
        if (age > 100) {
            System.out.println("Мы Вам перезвоним");
        } else if (exp < 5) {
            System.out.println("Вы подходите на должность стажера");
        } else if (exp >= 5) {
            System.out.println("Вы подходите на должность разработчика");
        }
    }
}
