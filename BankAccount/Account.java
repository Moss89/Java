package com.Tom;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private Date dateCreated = new Date();
    private static double annualInterestRate = 0;


    public Account() {
        this(0,0);
    }

    // Construct a circle with the specified radius
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public double getBalance(){
        return this.balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonthlyInterest(){
        return (this.balance * annualInterestRate) / 12;
    }

    public void withdraw(double amount){
        if (this.getBalance()>= amount){
            this.setBalance(this.getBalance() - amount);
        }
        else{
            System.out.println("Not enough money in account!");
        }
    }
    public void deposit(double amount){
        this.setBalance(this.getBalance() + amount);
    }

    public String toString() {
        return "ID: " + this.getId() + " Balance: " + this.getBalance()
                + " Date Created: " + this.getDateCreated();
    }
}
