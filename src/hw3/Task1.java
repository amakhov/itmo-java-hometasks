package hw3;
/*Задачи на FOR (можно не решать, если циклы понятны)
        Вывести все неотрицательные элементы последовательности 90 85 80 75 70 65 60 и тд
        Вывести на экран первые 10 элементов последовательности 2 4 6 8 10 и тд */
public class Task1 {
    public static void main(String[] args) {
        for (int start = 90, end = 0; start > 0; start-=5) {
            System.out.println(start);
        }

        for (int start1 = 2, count = 1; count <= 10; start1+=2) {
            count++;
            System.out.println(start1);
        }

    }
}
