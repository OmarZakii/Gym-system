package com.company;

import javax.naming.Name;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClientWindow extends JFrame implements ActionListener  {
    JTextPane Name;
    JTextPane Age;
    JTextPane ID;
    client c = new client();
    public String[] arr;
    public String[] myTrainer;
    int cnt=0;
    Membership m= new Membership();



    public void setDuration(Membership member){
        List<String> array=new ArrayList<>();

        int count=0;

        for(String key: member.duration.keySet()){
            array.add(key);
            count++;
        }
        int x=0;
        this.arr = new String[count];
        for(String item:array){

            arr[x] = item;
            x++;
        }

    }
    public ClientWindow(List<Trainer> Trainers){

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground( Color.BLACK);
        setDuration(m);

        for(Trainer Trainer:Trainers){
            cnt++;
            System.out.println(Trainer.getName());
        }
        int x=0;
        this.myTrainer = new String[cnt];
        for(Trainer Trainer:Trainers){
            System.out.println(Trainer.getName());
            myTrainer[x]=Trainer.getName();
            x++;
        }
        Name = new JTextPane();
        JLabel nameLabel= new JLabel();

        Age = new JTextPane();
        JLabel ageLabel= new JLabel();

        ID = new JTextPane();
        JLabel idLabel= new JLabel();

        JComboBox Durations = new JComboBox(arr);
        JLabel DurationsLabel= new JLabel();

        JTextPane SessionNum = new JTextPane();
        JLabel sessionNumLabel= new JLabel();
        String[] sessions = {"Fitness","Cardio","Hard workout","MMA"};

        JComboBox SessionType = new JComboBox(m.sessions.sessionType);

        JLabel SessionTypeLabel= new JLabel();

        JTextField SessionPrice = new JTextField();
        JLabel SessionPriceLabel= new JLabel();

        JComboBox Trainers2= new JComboBox(myTrainer);
        JLabel TrainersLabel= new JLabel();

        JButton addClient = new JButton();


        Container c = getContentPane();
        c.add(Name);
        c.setLayout(null);
        Name.setBounds(150,70,70,25);
        Name.setBackground(Color.lightGray);
        c.add(nameLabel);
        nameLabel.setText("Enter Name:");
        nameLabel.setBounds(20,70,70,25);
        nameLabel.setForeground(Color.cyan);

        c.add(Age);
        Age.setBounds(150,120,70,25);
        Age.setBackground(Color.lightGray);
        c.add(ageLabel);
        ageLabel.setText("Enter Age:");
        ageLabel.setBounds(20,120,70,25);
        ageLabel.setForeground(Color.cyan);

        c.add(ID);
        ID.setBounds(150,170 ,70,25);
        ID.setBackground(Color.lightGray);
        c.add(idLabel);
        idLabel.setText("Your Id:");
        idLabel.setBounds(20,170,70,25);
        idLabel.setForeground(Color.cyan);

        c.add(Durations);
        Durations.setBounds(150,230,150,25);
        Durations.setBackground(Color.lightGray);
        c.add(DurationsLabel);
        DurationsLabel.setText("Choose Duration:");
        DurationsLabel.setBounds(20,230,100,25);
        DurationsLabel.setForeground(Color.cyan);

        c.add(Trainers2);
        Trainers2.setBounds(150,280,150,25);
        Trainers2.setBackground(Color.lightGray);
        c.add(TrainersLabel);
        TrainersLabel.setText("Choose Trainer:");
        TrainersLabel.setBounds(20,280,100,25);
        TrainersLabel.setForeground(Color.cyan);

        c.add(SessionType);
        SessionType.setBounds(20,350,100,25);
        SessionType.setBackground(Color.lightGray);
        c.add(SessionTypeLabel);
        SessionTypeLabel.setText("Enter Type:");
        SessionTypeLabel.setBounds(20,320,70,25);
        SessionTypeLabel.setForeground(Color.cyan);

        c.add(SessionNum);
        SessionNum.setBounds(160,350,110,25);
        SessionNum.setBackground(Color.lightGray);
        c.add(sessionNumLabel);
        sessionNumLabel.setText("Session Number:");
        sessionNumLabel.setBounds(160,320,100,25);
        sessionNumLabel.setForeground(Color.cyan);

        c.add(SessionPrice);
        SessionPrice.setBounds(320,350,70,25);
        SessionPrice.setBackground(Color.LIGHT_GRAY);
        c.add(SessionPriceLabel);
        SessionPriceLabel.setText("Price:");
        SessionPriceLabel.setBounds(320,320,100,25);
        SessionPriceLabel.setForeground(Color.cyan);

        c.add(addClient);
        addClient.setText("Register");
        addClient.setBounds(320,400,100,25);

        if(Durations.getSelectedItem().toString()=="1 day"){
            SessionNum.setText("1");
            SessionPrice.setText("200");
        }






    }
    public void ShowMemberShipGui(String name, int age, int Id, Map<String, ArrayList> duration, List<Trainer> Trainers , String[] type){



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        client c = new client();
        c.setName(Name.getText());
        c.setAge(Integer.valueOf(Age.getText()));
        ID.setText(c.generateId());

//        c.setID(ID.setText(c.generateId()));
//        c.setID(Age);
//        c.SetMembership(,sessionType.getSelectedItem.toString(),);


    }
}

