package org.example;

public class CheckingAccount extends Account{
    private double limit = 200;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public double withdraw(double amount)  throws Throwable{

        if(amount > limit){

            System.out.println("You are exceeding transaction limit");

        }else {
            System.out.println("Transaction Successful");
        }

        return limit;
    }
}
