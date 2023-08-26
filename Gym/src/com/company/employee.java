package com.company;

public class employee extends Person{
    private int workingHours;
    private double salary;


    public employee() {
        this.workingHours = 0;
        this.salary = 0;
    }

    public employee(String name, int ID, int age, int workingHours, double salary) {
        super(name, ID, age);
        this.workingHours = workingHours;
        this.salary = salary;

    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    public void setPassword(int password) {
//        this.password = password;
//    }

    @Override
    public String toString() {
        return super.toString()+
                "workingHours=" + workingHours +
                ", salary=" + salary
                ;
    }
}
