package com.capg.banking;

public class SavingAccount extends Bank {
	double balance;
    double fixedDeposit;
    public SavingAccount(double balance,double fixedDeposit){
        this.balance=balance;
        this.fixedDeposit=fixedDeposit;
    }
    public void display(){
        System.out.println("Total money in saving:"+(balance+fixedDeposit));
    }
    public double get(){
        return balance+fixedDeposit;
    }
}
