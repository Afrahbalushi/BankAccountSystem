package org.example;

import java.io.FileWriter;
import java.util.Scanner;


public class Main {

    static double total;
    public static void main(String[] args) throws Throwable {


Account account = new Account();
CheckingAccount check = new CheckingAccount();
SavingAccount saving = new SavingAccount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter deposit amount:");
        double deposit = scanner.nextDouble();
        account.setBalance(deposit);
        account.deposit(deposit);

        System.out.println("Enter withdraw amount:");
        double withdraw = scanner.nextDouble();
        total = account.getBalance() - withdraw;
        account.withdraw(total);
        System.out.println("Your Bank Balance is: " + total);

        saving.interest();

        check.withdraw(withdraw);


        FileWriter file = new FileWriter("bank.txt");

        file.write("YOUR BANK ACCOUNT DETAILS \n\n");
        file.write("----------------------------------------------------\n\n");
        file.write("Account Number: " + account.getAccountNumber() + "\n");
        file.write("Account Holder Name: " + account.getAccountHolderName() + "\n");
        file.write("Deposit Amount: " + deposit + "\n");
        file.write("Withdraw Amount: " + withdraw + "\n");
        file.write("Total Balance: " + total + "\n");
        file.write("Interest Time: " + saving.time + " months " + "\n");
        file.write("Interest Rate: " + saving.rate + "\n");
        file.write("Interest Amount: " + saving.interest + "\n\n");
        file.write("----------------------------------------------------\n");

        file.close();
        System.out.println("Details save in File Successfully");


    }
}