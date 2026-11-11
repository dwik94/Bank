package com.dennis.model;

import com.dennis.exception.InsufficientFundsException;
import com.dennis.exception.InvalidAmountException;

public class Account {
    private Long id;
    private double balance;

    public Account(Long id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
           throw new InvalidAmountException("You can not deposit a negative amount of money!");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("You can not withdraw a negative amount of money!");
        }

        if (amount > this.balance) {
            throw new InsufficientFundsException("You can not withdraw more money than you have!");
        }

        this.balance -= amount;

    }

    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + "\nBalance: " + this.balance;
    }
}



