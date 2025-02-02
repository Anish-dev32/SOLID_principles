package com.java.solid.principles.S.Good;

import com.java.solid.principles.S.Bad.Account;
import com.java.solid.principles.S.Bad.AccountOperations;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(123);
        account.setFirstName("Anish");
        account.setTotalAmount(BigDecimal.valueOf(100000));
        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(12232323),123);

        System.out.println(account.getTotalAmount());
    }
}