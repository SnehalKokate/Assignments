package com.generic.hashset;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		 HashSet<Employee> set= new HashSet();
	        Employee e1=new Employee(1,"Snehal",30000,"Developer");
	        Employee e2=new Employee(2,"Utkarsh",20000,"Q/A");
	        Employee e3=new Employee(3,"Rutuja",30000,"Developer");
	        Employee e4=new Employee(4,"Pratap",50000,"Manager");
	        set.add(e1);
	        set.add(e2);
	        set.add(e3);
	        set.add(e4);
	        //printing all the details of the objects
	        System.out.println(set);
	}

}
class Employee{
    int id,salary;
    String name,dept;
    public Employee(int id, String name, int salary, String dept){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    @Override
    public String toString(){
        return "{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}";
    }

}
