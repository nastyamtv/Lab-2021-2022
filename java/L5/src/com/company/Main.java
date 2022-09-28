package com.company;
import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

class Main extends Frame{
    Main(String s, int w, int h){
        super(s);
        setSize(w,h);
        setVisible(true);
        addWindowFocusListener(new WindowAdapter() {
            public  void windowClosing(WindowEvent ev){ System.exit(0); }
        });
    }
    public void paint(Graphics g){
        setLayout(null);

        Font f = new Font("Serif", Font.BOLD, 15);
        setFont(f);
        //Checkbox chl = new Checkbox("Book");
        //chl.setBounds(20, 90, 100, 30); add(chl);
        //Button b1 = new Button("Продолжить");
        //b1.setBounds( 30, 220, 100, 30); add(b1);



        Label l1 = new Label("Full Name:", Label.CENTER);
        l1.setBounds(70, 50, 120, 30); add(l1);
        Label l2 = new Label("Address:", Label.CENTER);
        l2.setBounds(70, 80, 120, 30); add(l2);
        Label l3 = new Label("City:", Label.CENTER);
        l3.setBounds(70, 110, 120, 30); add(l3);
        Label l4 = new Label("ZIP Code:", Label.CENTER);
        l4.setBounds(70, 140, 120, 30); add(l4);
        Label l5 = new Label("Phone:", Label.CENTER);
        l5.setBounds(70, 170, 120, 30); add(l5);
        Label l6 = new Label("Additional Information:", Label.CENTER);
        l6.setBounds(70, 200, 200, 30); add(l6);
        Label l7 = new Label("E-mail:", Label.CENTER);
        l7.setBounds(70, 230, 120, 30); add(l7);
        Label l8 = new Label("Password:", Label.CENTER);
        l8.setBounds(70, 260, 120, 30); add(l8);
        Label l9 = new Label("Confirm password:", Label.CENTER);
        l9.setBounds(70, 290, 200, 30); add(l9);
        //TextField t1 = new TextField();
        //t1.setBounds(20, 50, 140, 30); add(t1);
    }

    public  static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public  void run(){
                new Main("Laba", 650, 800);
            }
        });
    }
}


