package com.collection.hashset;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Product p1=new Product("Laptop");
		Product p2=new Product("Mobile");
		Product p3=new Product("Computer");
		Product p4=new Product("Tablet");
		Product p5=new Product("Mouse");
		Product p6=new Product("Keyboard");
		Product p7=new Product("CPU");
		Product p8=new Product("Printer");
		Product p9=new Product("Scanner");
		Product p10=new Product("LED");
		
        HashSet<Product> no_duplicate=new HashSet<Product>();
        no_duplicate.add(p1);
        no_duplicate.add(p2);
        no_duplicate.add(p3);
        no_duplicate.add(p4);
        no_duplicate.add(p5);
        no_duplicate.add(p6);
        no_duplicate.add(p7);
        no_duplicate.add(p8);
        no_duplicate.add(p9);
        no_duplicate.add(p10);
      
        
        //the duplicate object addition
        no_duplicate.add(p9);
        System.out.println(no_duplicate);

	}

}
class Product{
    private String pName;
    public Product(String pName){
        this.pName=pName;
    }
    @Override
    public String toString(){
        return "Product name: "+pName;
    }
}