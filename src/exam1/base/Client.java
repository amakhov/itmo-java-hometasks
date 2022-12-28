package exam1.base;

import java.time.LocalDate;

public class Client {
    private final String firstName;
    private final String lastName;
    private final int yearClient;

    public Client(String firstName, String lastName, int yearClient) {
        this.firstName = firstName;
        this.lastName = lastName;

        LocalDate todayDay = LocalDate.now();
        int todayYear = todayDay.getYear();
        int year18 = todayYear - 18;
        if (yearClient > todayYear) {
            throw new IllegalArgumentException("Несущестующий год");
        } else if (yearClient >= year18) {
            throw new IllegalArgumentException("Клиенты с 18 лет");
        } else if (yearClient < 1930) {
            throw new IllegalArgumentException("Клиенты могут быть с 1930 года рождения");
        }
        this.yearClient = yearClient;
    }

    public String getFirstLastName() {
        return firstName + " " + lastName;
    }


    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearClient=" + yearClient +
                '}';
    }
}
