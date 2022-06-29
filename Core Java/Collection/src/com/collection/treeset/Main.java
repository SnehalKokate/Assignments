package com.collection.treeset;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your sorting category");
        System.out.println("1.name  2.id  3.salary   4.department");
        int choose = scanner.nextInt();
        
        Set<Employees> s = null;
        if(choose == 1) {
            s = new TreeSet<>(new Name());
        }
        else if(choose == 2) {
            s = new TreeSet<>(new IdNumber());
        }
        else if(choose == 3) {
            s = new TreeSet<>(new Salary());
        }
        else if(choose == 4) {
            s = new TreeSet<>(new Department());
        }
        s.add(new Employees ("Ram",123,50000,"HR"));
        s.add(new Employees ("Sham",456,10000,"Dev"));
        s.add(new Employees ("Krishna",789,60000,"Manager"));
        s.add(new Employees("Raja",460,10000,"Dev"));
        s.add(new Employees("Rani",461,10000,"Dev"));
        s.add(new Employees ("Sita",457,50000,"Dev"));
        s.add(new Employees ("Radha",458,10000,"Dev"));
        s.add(new Employees ("Vir",550,60000,"tester"));
        s.add(new Employees("Yash",551,10000,"tester"));
        s.add(new Employees("Neha",552,10000,"tester"));
        s.add(new Employees("Gauresh",553,10000,"tester"));
        s.add(new Employees("Gauri",459,10000,"Dev"));
        for(Employees temp:s) {
            System.out.println(temp);

        }

	}

}

class IdNumber implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else {
            return -1;
        }
    }

}

class Name implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

class Department implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getDepartments().compareTo(o2.getDepartments());
    }

}

class Salary implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        if (o1.getSal() > o2.getSal()) {
            return 1;
        } else {
            return -1;
        }

    }

}
