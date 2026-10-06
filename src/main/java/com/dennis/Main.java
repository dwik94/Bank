package com.dennis;

import com.dennis.model.Account;
import com.dennis.model.Bank;

public class Main {
    static void main() {

        Bank bank = new Bank();

        Account account = bank.getAccount();

        account.deposit(50000);
        account.withdraw(100);

        IO.println(account);




    }
}
