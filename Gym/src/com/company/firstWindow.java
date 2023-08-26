package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

public class firstWindow extends JFrame {
    List<Trainer> T= new ArrayList<>();

    public void takeTrainer(List<Trainer> Trainers){
        T=Trainers;
        for(Trainer Trainer:Trainers){
            System.out.println(Trainer.getName());
        }

    }
    public firstWindow(String title){
       super(title);
       //set layout manager
        setLayout(new FlowLayout());



        //create swing component
        JButton client = new JButton("CLIENT");
        JButton trainer = new JButton("TRAINER");
        JButton SalesMan= new JButton("SALES");





        //Add swing componennt to content pane
        Container c =getContentPane();
        c.add(SalesMan,FlowLayout.LEFT);
        c.add(client,FlowLayout.CENTER);
        c.add(trainer,FlowLayout.RIGHT);

        //Add behaviour to the button to navigate
        client.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClientWindow clientWindow=new ClientWindow(T);




            }
        });
        trainer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TrainerWindow();


            }
        });
        SalesMan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SalesWindow();


            }
        });


    }

}
