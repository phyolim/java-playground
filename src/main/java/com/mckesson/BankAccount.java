package com.galvanize;

public class BankAccount {
    private String name;
    private long balance;

    public void deposit(long cents) {
        balance += cents;
    }

    public void withdraw(long cents) {
        balance -= cents;
    }

    public long balance() {
        return balance;
    }

    public boolean isOverDrawn() {
        return balance < 0;
    }
}