package org.example.task1;

// шаблон для создания объектов (экземпляров)
public class BankAccount implements Printable {
    private String accountNu;
    private int balance;

    // сеттер
    public void setBalance (int balance) {
        this.balance = balance;
    }

    // геттер
    public int getBalance () {
        return this.balance;
    }

    @Override
    public void print() {
        System.out.println("Баланс аккаунта " + this.balance);
    }
}
