package com.company;
import javax.swing.SwingUtilities;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingContainer;

public class Main {

    public static void main(String[] args) {
        Trainer x = new Trainer("ahmed", 121, 22, 22, 112.2,3);
        Trainer y = new Trainer("shereef", 1021, 43, 22, 2102.2,2);
        Trainer z = new Trainer("hadi", 1201, 42, 12, 1220.2,5);
        Trainer w = new Trainer("haitham", 9201, 32, 21, 2050.2,10);
//        salesMan sales = new salesMan("ahmed", 121, 22, 22, 112);
//        System.out.println(x.toString());
        List<Trainer> Trainers = new ArrayList<Trainer>();
        Trainers.add(x);
        Trainers.add(y);
        Trainers.add(z);
        Trainers.add(w);

//        List<salesMan> sale = new ArrayList<salesMan>();
//        List<employee> employees=new ArrayList<>();
//
//        for (int i = 0; i < 6; i++) {
//            employees.add(x);
//        }
//        for (int i = 0; i < 6; i++) {
//            employees.add(x);
//        }
//        for (int i = 0; i < 6; i++) {
//            employees.add(sales);
//        }

//        Staff staff=new Staff(employees);
//        staff.addEmployee(x);
//        staff.addEmployee(sales);


//        Membership membership=new Membership();
//
//        membership.createMemberShip("1 year",Trainers,w ,"Hi");
//        System.out.println(membership.toString());
//        System.out.println(membership.getUniqueId());
//        System.out.println(membership.getUniqueId());


//        System.out.println(staff.toString());
        client client=new client("Name",1010,22);
        client.SetMembership(x,"cardio","2 weeks",Trainers);
        System.out.println(client.GetMembership());




        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                firstWindow frame= new firstWindow("Main Window");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(500,400);
                frame.setVisible(true);
                frame.takeTrainer(Trainers);


            }
        });

    }


}
