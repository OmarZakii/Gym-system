package com.company;

public class Trainer extends employee implements Attendance {
    private int Rating;
    private int clientNum;
//    public void setPassword(int password) {
//        this.password = password;
//    }

    public Trainer() {
        this.clientNum = 0;
    }

    public Trainer(String name, int ID, int age, int workingHours, double salary, int clientNum) {
        super(name, ID, age, workingHours, salary);
        this.clientNum = clientNum;
    }

    public int getClientNum() {
        return clientNum;
    }

    public void setClientNum(int clientNum) {
        this.clientNum = clientNum;
    }

    public void addClient(){
        if(this.clientNum > 10)
            System.out.println("please choose another coach");
        else{
            this.clientNum++;
        }

    }

    @Override
    public String toString() {
        return  super.toString()+
                "\n";
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
