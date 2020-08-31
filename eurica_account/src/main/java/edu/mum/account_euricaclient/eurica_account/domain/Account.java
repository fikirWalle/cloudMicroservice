package edu.mum.account_euricaclient.eurica_account.domain;

public class Account {

    private String accountNumber;
    private String balance;

    public Account(String accountNumber, String balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
