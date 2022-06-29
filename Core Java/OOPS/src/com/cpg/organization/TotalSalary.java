package com.cpg.organization;

public class TotalSalary {

	public static void main(String[] args) {
		
		 Manager m=new Manager(50000,10000);
	        Labour l=new Labour(500,20);
	        m.salary();
	        l.salary();
	        int totalSalary=m.get()+l.get();
	        
	        System.out.println("Total Salary of all employees: "+totalSalary);

	}

}
