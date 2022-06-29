package com.collection.treeset;

public class Employees {
	private String name;
    private int id;
    private double sal;
    private String departments;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public String getDepartments() {
        return departments;
    }
    public void setDepartments(String departments) {
        this.departments = departments;
    }
    public Employees(String name, int id, double sal, String departments) {
        super();
        this.name = name;
        this.id = id;
        this.sal = sal;
        this.departments = departments;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", departments=" + departments + "]";
    }

}

