package org.example;

public class Account {
    private int accountNumber = 1033900921;
    private String accountHolderName = "Afrah Ali";
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    Account(){
    }

    public double deposit(double amount){

       double totalDeposit = balance + amount;
       return totalDeposit;
    }

    public double withdraw(double amount)  throws Throwable{

        if(amount > balance){

            System.out.println("Cannot complete the transaction");

            }else {
            System.out.println("Transaction Successful");

        }

        return balance;
    }



}
