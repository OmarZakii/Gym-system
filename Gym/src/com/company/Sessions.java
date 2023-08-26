package com.company;

public class Sessions {
    private int SessionsNum;
    public final String sessionType[]={"fitness","cardio","Hard workout","MMA"};
    private int sessionPrice;
    private Trainer sessionTrainer;
    private String MysessionType;

    public Sessions() {

    }
    public Sessions(int sessionsNum,int sessionPrice,Trainer Trainer,String mysessionType){
        this.sessionPrice=sessionPrice;
        this.SessionsNum=sessionsNum;
        this.sessionTrainer=Trainer;
        this.MysessionType=mysessionType;

    }
    public void returnSession(String type){
        for (String item:sessionType) {
            if(item== type)
                this.MysessionType=item;
        }

    }

    public String getMysessionType() {
        return MysessionType;
    }

    public void setMysessionType(String mysessionType) {
        MysessionType = mysessionType;
    }

    public String getSessionType1(int x){
        return this.sessionType[x];
    }

    public String[] getSessionType() {
        return sessionType;
    }

    public int getSessionPrice() {
        return sessionPrice;
    }

    public void setSessionPrice(int sessionPrice) {
        this.sessionPrice = sessionPrice;
    }

    public Trainer getSessionTrainer() {
        return sessionTrainer;
    }

    public void setSessionTrainer(Trainer sessionTrainer) {
        this.sessionTrainer = sessionTrainer;
    }


    public int getSessionsNum() {
        return SessionsNum;
    }

    public void setSessionsNum(int sessionsNum) {
        SessionsNum = sessionsNum;
    }
}
