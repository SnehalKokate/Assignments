package com.cpg.organization;

public class Labour extends Employee{

	int overtime;
    int labourSalary;

    public Labour(int labour_salary,int overtime){
        this.labourSalary=labour_salary;
        this.overtime=overtime;
    }
//    Method overriding
    public void salary(){
        System.out.println("Labour Salary:"+labourSalary);
        System.out.println("labour overtime: "+overtime);
    }
    public int get(){
        return labourSalary;
    }

}
