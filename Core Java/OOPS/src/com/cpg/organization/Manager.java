package com.cpg.organization;

public class Manager extends Employee {
	int sal;
	int incentive;
	
    public Manager(int sal,int incentive){
        this.sal=sal;
        this.incentive=incentive;
    }

//    Method overriding
    public int get(){
        return sal+incentive;
    }
    
	public void salary() {
		 System.out.println("Manager Salary:"+(sal+incentive));

	}

}
