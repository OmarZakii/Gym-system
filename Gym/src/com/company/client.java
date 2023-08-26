package com.company;
import java.util.*;


public class client extends Person implements Attendance {



    private Membership newMember;
    public client(){

    }
    public client(String name, int Id,int age){
        super(name,Id,age);
        newMember= new Membership();

    }
    public void SetMembership(Trainer Trainer,String sessionType,String Duration, List<Trainer> Trainers ){
//        this.newMember.duration=duration;
//        this.newMember.sessions.setSessionsNum(sessionNum);
//        this.newMember.sessions.setSessionPrice(sessionPrice);
//        this.newMember.sessions.setSessionTrainer(Trainer);
//        this.newMember.sessions.returnSession(sessionType);
        this.newMember.createMemberShip(Duration,Trainers,Trainer,sessionType);
    }
    public Membership GetMembership(){
        return newMember;
    }

    @Override
    public String Attendance(boolean check) {
        if (check== true) {
            this.newMember.sessions.setSessionsNum(this.newMember.sessions.getSessionsNum() - 1);
            return "check in";
        }
        else if(check==false) {
            return "check out";
        }
        return "check out";

    }
    public String generateId(){
        String uniqueID = UUID.randomUUID().toString();
        return uniqueID;
    }
}

