package com.dennis;

import com.dennis.model.Account;
import com.dennis.model.Bank;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static void main() {

        Bank bank = new Bank();

        Account account = bank.getAccount();

        account.deposit(50000);
        account.withdraw(100);

        IO.println(account);

        while (true) {

            IO.println("[1]: check balance");
            IO.println("[2]: deposit");
            IO.println("[3]: withdraw");
            IO.println("[10]: exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> checkBalance(account);

                case 2 -> depositMenu(account);

                case 3 -> withdrawMenu(account);

                case 10 -> {return;
                }
            }
        }
    }

    public static void checkBalance (Account account){
        IO.println("Balance: " + account.checkBalance());
        }

    public static void depositMenu (Account account){
        IO.println("Enter the amount of money you want to deposit!");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
    }

    public static void withdrawMenu (Account account) {
        IO.println("Enter the amount of money you want to withdraw!");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }
}

