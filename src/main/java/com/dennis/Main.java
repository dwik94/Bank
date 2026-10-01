package com.dennis;

import com.dennis.model.Account;

public class Main {
    static void main() {

        Account account = new Account(1L,30000);

        IO.println(account);

    }
}
