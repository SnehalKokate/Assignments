package com.lambda.assignmentq2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the total price of the order");
	        int price=sc.nextInt();
	        System.out.println("Enter the status of your order: 1} Accepted  2} Completed");
	        int status= sc.nextInt();
	        Order display =(p,s) -> {

	        	 if(p>10000 && s==1){
	                 System.out.println("Your order of amount "+price+" is accepted ");
	             }
	             else if(p<10000){
	                 System.out.println("The amount of order is not processable");
	             }
	             else if(p>10000 && s==2){
	            	 System.out.println("Your order of amount "+price+" is completed ");
		            }
	             else{
	                 System.out.println("order not processable");
	             }
	        };
	        display.print(price,status);

	}

}
