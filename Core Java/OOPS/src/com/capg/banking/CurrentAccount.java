package com.capg.banking;

public class CurrentAccount extends Bank {
	double balance;
    double cashCredit;
    public CurrentAccount(double balance,double cashCredit){
        this.balance=balance;
        this.cashCredit=cashCredit;
    }
    public void display(){
        System.out.println("Total money in current: "+(balance+cashCredit));
    }
    public double get(){
        return balance+cashCredit;
    }
}
