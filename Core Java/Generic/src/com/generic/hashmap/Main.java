package com.generic.hashmap;

import java.util.HashMap;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		 HashMap<Integer,Double> store=new HashMap<Integer,Double>();
	        Random r=new Random();
	        int max=20;
	        double range=2;
	        double min=1;
	        for (int i = 0; i < 10; i++) {
	            int x=(int)(r.nextInt(max));
	            double y=range+r.nextDouble()-min;
	            store.put(x,y);
	            System.out.println(x+" "+y);
	        }
	        System.out.println(" ");
	        System.out.println(store);

	}

}
