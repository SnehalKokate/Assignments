package com.lammda.assignmentq1;

import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers to the calculator: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Your Choices 1)Addition 2)Subtraction 3)Multiplication 4)Divide: ");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                Calculator add = (x,y) -> System.out.println(x+y);
                add.number(a,b);
                break;
            case 2:
                Calculator sub= (x,y) -> System.out.println(x-y);
                sub.number(a,b);
                break;
            case 3:
                Calculator mul=(x,y) -> System.out.println(x*y);
                mul.number(a,b);
                break;
            case 4:
                Calculator div=(x,y) -> System.out.println(x/y);
                div.number(a,b);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
	}

}

