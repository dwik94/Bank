package com.dennis.model;

public class Bank {

   private Account account = new Account(1L,0);

   public Bank(){

   }

   public Account getAccount(){
      return this.account;
   }

}
