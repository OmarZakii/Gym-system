package com.company;
import java.util.*;
import java.util.Map;

public class Membership {

   public Map <String,ArrayList> duration= new HashMap<>();

   private Trainer assignedTrainer;
   protected Sessions sessions;
//   protected String creationDate;
//   protected String EndDate;
    private  int uniqueId = 1000;

   int getUniqueId()
   {
      int x=this.uniqueId;
      uniqueId++;
      return x ;
   }




   public Membership(){
     setMyDict();
     sessions=new Sessions();



   }
   public void setMyDict(){
      this.duration.put("1 day",new ArrayList<Integer>());
      this.duration.get("1 day").add(1);
      this.duration.get("1 day").add(50);
      this.duration.put("2 weeks",new ArrayList<Integer>());
      this.duration.get("2 weeks").add(8);
      this.duration.get("2 weeks").add(200);
      this.duration.put("1 month",new ArrayList<Integer>());
      this.duration.get("1 month").add(20);
      this.duration.get("1 month").add(400);
      this.duration.put("3 month",new ArrayList<Integer>());
      this.duration.get("3 month").add(50);
      this.duration.get("3 month").add(800);
      this.duration.put("6 months",new ArrayList<Integer>());;
      this.duration.get("6 months").add(80);
      this.duration.get("6 months").add(1200);
      this.duration.put("1 year",new ArrayList<Integer>());
      this.duration.get("1 year").add(120);
      this.duration.get("1 year").add(2000);


   }


   public void createMemberShip(String Duration,List<Trainer> Trainers,Trainer Trainer,String Type){
      System.out.println(duration);
      for(String key: duration.keySet()){
         System.out.println(key);
         System.out.println(Duration);

         if(Duration == key){
            ArrayList <Integer> var =duration.get(key);
            System.out.println(var.get(0));
            sessions.setSessionsNum(var.get(0));
            sessions.setSessionPrice(var.get(1));
         }
      }
      for(Trainer trainer:Trainers){
         if(trainer==Trainer){
            trainer.addClient();
            this.assignedTrainer=trainer;
         }
      }
      sessions.setMysessionType(Type);



   }
   public void RenewMemberShip(){

   }
   public void CancelMembership(){

   }
   public void TransferMembership(){

   }

   @Override
   public String toString() { return "Membership{" +

              " assignedTrainer=" + assignedTrainer.getName() +
              ", sessions Number="+sessions.getSessionsNum()+
               ",Sessions price="+sessions.getSessionPrice()+
              '}';
   }
}
