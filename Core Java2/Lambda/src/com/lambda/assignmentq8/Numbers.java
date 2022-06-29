package com.lambda.assignmentq8;

import java.util.ArrayList;

public class Numbers extends Thread {
	 public void run(){
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(2);
	        numbers.add(8);
	        numbers.add(60);
	        numbers.add(200);
	        numbers.add(400);
	       
	        //This will print the array list using a consumer function
	        numbers.forEach(t -> System.out.println(t));
}
}