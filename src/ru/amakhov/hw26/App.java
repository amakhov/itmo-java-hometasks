package ru.amakhov.hw26;

public class App {
    public static void main(String[] args) {
        Account account1 = new Account(1, 150);
        Account account2 = new Account(2, 200);


        Bank bank = new Bank();
        bank.transferMoney(account1, account2, 50);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

    }
}
