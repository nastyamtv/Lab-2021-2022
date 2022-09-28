package com.company;
import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

class Main extends Frame{
    Main(String s, int w, int h){
        super(s);
        setLayout(null);
        Font f = new Font("Serif", Font.BOLD, 15);
        setFont(f);

        Label l1 = new Label("Full Name:", Label.RIGHT);
        l1.setBounds(70, 50, 160, 30); add(l1);
        TextField t1 = new TextField("Petruk Petro Petrovich");
        t1.setBounds(250, 50, 400, 25); add(t1);
        Label l1_1 = new Label("*");
        l1_1.setForeground(Color.red);
        l1_1.setBounds(655, 45, 160, 30); add(l1_1);

        Label l2 = new Label("Address:", Label.RIGHT);
        l2.setBounds(70, 110, 160, 30); add(l2);
        TextField t2 = new TextField("Ukraine, Volyn region, Sukhomlynskoho street 4");
        t2.setBounds(250, 110, 400, 25); add(t2);
        Label l2_1 = new Label("*");
        l2_1.setForeground(Color.red);
        l2_1.setBounds(655, 105, 160, 30); add(l2_1);

        Label l3 = new Label("City:", Label.RIGHT);
        l3.setBounds(70, 140, 160, 30); add(l3);
        TextField t3 = new TextField("Lutsk");
        t3.setBounds(250, 140, 400, 25); add(t3);
        Label l3_1 = new Label("*");
        l3_1.setForeground(Color.red);
        l3_1.setBounds(655, 135, 160, 30); add(l3_1);

        Label l4 = new Label("ZIP Code:", Label.RIGHT);
        l4.setBounds(70, 200, 160, 30); add(l4);
        TextField t4 = new TextField("142191");
        t4.setBounds(250, 200, 400, 25); add(t4);


        Label l5 = new Label("Phone:", Label.RIGHT);
        l5.setBounds(70, 230, 160, 30); add(l5);
        TextField t5 = new TextField("(066)6666666");
        t5.setBounds(250, 230, 400, 25); add(t5);
        Label l5_1 = new Label("*");
        l5_1.setForeground(Color.red);
        l5_1.setBounds(655, 225, 160, 30); add(l5_1);

        Label l6 = new Label("Additional Information:");
        l6.setBounds(70, 320, 180, 30); add(l6);
        TextField t6 = new TextField();
        t6.setBounds(250, 290, 400, 100); add(t6);


        Label l7 = new Label("E-mail:", Label.RIGHT);
        l7.setBounds(70, 430, 160, 30); add(l7);
        TextField t7 = new TextField("myemail@gmail.com");
        t7.setBounds(250, 430, 400, 25); add(t7);
        Label l7_1 = new Label("*");
        l7_1.setForeground(Color.red);
        l7_1.setBounds(655, 425, 160, 30); add(l7_1);

        Label l8 = new Label("Password:", Label.RIGHT);
        l8.setBounds(70, 490, 160, 30); add(l8);
        //TextField t8 = new TextField("mypassword");
        JPasswordField t8 = new JPasswordField("mypassword");
        t8.setEchoChar('$');
        t8.setBounds(250, 490, 400, 25); add(t8);
        Label l8_1 = new Label("*");
        l8_1.setForeground(Color.red);
        l8_1.setBounds(655, 485, 160, 30); add(l8_1);

        Label l9 = new Label("Confirm password:", Label.RIGHT);
        l9.setBounds(70, 520, 160, 30); add(l9);
        JPasswordField t9 = new JPasswordField("mypassword");
        t9.setBounds(250, 520, 400, 25); add(t9);
        Label l9_1 = new Label("*");
        l9_1.setForeground(Color.red);
        l9_1.setBounds(655, 515, 160, 30); add(l9_1);

        Checkbox chl = new Checkbox("I want to receive news by mail");
        chl.setBounds(250, 570, 400, 30); add(chl);
        chl.setState(true);

        Button b1 = new Button("Continue");
        b1.setBackground(Color.RED);
        b1.setBounds( 545, 620, 100, 30); add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean b=false;

                    if ((t1.getText()).trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Enter all data");
                        b=true;
                    }

                    if(b==false) {
                        t1.setText("");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                        t5.setText("");
                        t6.setText("");
                        t7.setText("");
                        t8.setText("");
                        t9.setText("");
                        JOptionPane.showMessageDialog(null, "Success");
                    }


            }
        });

            setSize(780, 700);
        setVisible(true);

    }


    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D f = (Graphics2D) g;
        f.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1, new float[]{10f, 5f}, 0f));
        f.setColor(Color.BLACK);
        f.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        f.drawLine(0, 90, 800, 90);
        f.drawLine(0, 180, 800, 180);
        f.drawLine(0, 270, 800, 270);
        f.drawLine(0, 410, 800, 410);
        f.drawLine(0, 470, 800, 470);
        f.drawLine(0, 560, 800, 560);
        f.drawLine(0, 610, 800, 610);
    }
    public  static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public  void run(){
                new Main("Laba", 650, 800);
            }
        });
    }
}


