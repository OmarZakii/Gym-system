package com.company;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Staff {

    public List<employee> staff;

    public Staff(){


    }
    public Staff(List<employee> myStaff){

        this.staff=myStaff;

    }

    public String employeeInfo(){
        String employeeVar=":\n" ;
        for(employee item:this.staff){
            employeeVar = employeeVar +item.toString();

        }
        return employeeVar;
    }
    public void addEmployee(employee Employee){
        this.staff.add(Employee);
    }


//    public void setTrainers(List<Trainer> trainers) {
//        Trainers = trainers;
//    }
//    public void addTrainer(Trainer trainer){
//        this.Trainers.add(trainer);
//    }

    @Override
    public String toString() {
        return "Staff{" +
                "employee" +employeeInfo()+
                '}';
    }
}
