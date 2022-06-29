package com.capg.banking;

public class Main {

	public static void main(String[] args) {
		 SavingAccount s=new SavingAccount(30000,4000);
	        CurrentAccount c=new CurrentAccount(500000,20000);
	        s.display();
	        c.display();
	        double totalAmount=s.get()+c.get();
	        System.out.println("The total money in bank: "+totalAmount);

	}

}
