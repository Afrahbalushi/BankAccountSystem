package org.example;

import java.util.Scanner;
import java.util.TimeZone;

public class SavingAccount extends Account{

    double rate;
    int time;
    double interest;
    Scanner scanner = new Scanner(System.in);

    public double interest(){
        System.out.println("Enter interest rate:");
        rate = scanner.nextDouble();

        System.out.println("Enter interest time:");
        time = scanner.nextInt();


         interest = Main.total * rate * time;

        System.out.println("Your interest for " + time + " months is: " + interest);
        return interest;

    }
}
