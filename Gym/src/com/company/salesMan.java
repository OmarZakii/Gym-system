package com.company;

import java.util.ArrayList;

public class salesMan extends employee  implements Attendance{
    private double KPI=100;
    private int target=0;
    private ArrayList<client> clientArrayList;
    public void addmember(client c){
        this.clientArrayList.add(c);
        target++;
    }

    public salesMan() {

    }

    public salesMan(String name, int ID, int age, int workingHours, double salary, double KPI, int target, ArrayList<client> clientArrayList) {
        super(name, ID, age, workingHours, salary);
        this.KPI = KPI;
        this.target = target;
        this.clientArrayList = clientArrayList;
    }

    public double getKPI(int target) {
        return target/KPI;
    }



    public int getTarget() {
        return target;
    }



    public ArrayList<client> getClientArrayList() {
        return clientArrayList;
    }

    public void setClientArrayList(ArrayList<client> clientArrayList) {
        this.clientArrayList = clientArrayList;
    }

    @Override
    public String toString() {
        return "salesMan{" +super.toString()+

                '}'+"\n";
    }
    @Override
    public String Attendance(boolean check) {
        if (check== true)
            return "check in";
        else if(check==false)
            return "check out";
        return "check out";

    }
}
