package ru.amakhov.hw26;

public class Transaction implements Runnable{
    private final Account src; // с какого аккаунта осуществлять перевод
    private final Account dst; // на какой аккаунт осуществлять перевод
    private final int money; // сколько переводить

    public Transaction(Account src, Account dst, int money) {
        this.src = src;
        this.dst = dst;
        this.money = money;
    }

    @Override
    public void run() {
        // TODO перевод денежных средств со счета src на счет dst в количестве money
        if (src.getBalance() >= money) {
            src.setBalance(src.getBalance() - money);
            dst.setBalance(dst.getBalance() + money);
        }
    }
}