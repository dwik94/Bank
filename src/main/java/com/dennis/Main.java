package com.dennis;

import com.dennis.model.Account;
import com.dennis.model.Bank;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        Account account = bank.getAccount();

        account.deposit(50000);
        account.withdraw(100);

//        IO.println(account);

        IO.println("[1]: check balance");
        IO.println("[2]: deposit");
        IO.println("[3]: withdraw");
        IO.println("[10]: exit");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1 -> checkBalance(account);
        }



    }

    public static void checkBalance(Account account) {
       IO.println("Balance: " + account.checkBalance());
    }

}
