package com.dennis.model;

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
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }

        else {
            IO.println("You don´t have enough money!");
        }
    }


    @Override
    public String toString() {
        return "Id: " + this.id + "\nBalance: " + this.balance;
    }
}



//public double checkBalance() {
//
//}