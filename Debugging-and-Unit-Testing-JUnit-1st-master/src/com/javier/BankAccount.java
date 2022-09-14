package com.javier;


public class BankAccount {

    public static final Object CHECKING = 1;
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance, Object o) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM, not
    // big transaction allowed.
    public double deposit(double amount, boolean branch) {
        if(branch==true) {
            balance += amount;
        }else{
            System.out.println("No branch available");
        }
        return balance;
        }


    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM, because
    // not big amount is allowed.
    public double withdraw(double amount, boolean branch) {
        if(branch==true) {
            balance -= amount;
        }else{
            System.out.println("No branch available");
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking() {
        System.out.println("This method is checking...");
        return true;
    }


}
