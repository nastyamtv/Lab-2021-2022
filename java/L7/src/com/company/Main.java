package com.company;
import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

class Main extends Frame{
    String botSelected = "";
    public String x="0";
    public String y="0";
    public double res=0;
    public double d=0;
    public boolean r=false;
    public boolean temp=false;


    Main(String s, int w, int h){
        super(s);
        setLayout(null);
        Font f = new Font("Serif", Font.BOLD, 15);
        setFont(f);
        setSize(650, 500);
        setVisible(true);
        TextField t1 = new TextField("");
        t1.setBounds(50, 50, 400, 45); add(t1);

        Button b1 = new Button("1");
        b1.setBounds( 55, 155, 50, 50); add(b1);
        ActionListener clk = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+"1");
                if(temp==false) {
                    x = x+"1";

                }
                else{
                    y=y+"1";
                }
                repaint();
            }
        };
        b1.addActionListener(clk);



        Button b2 = new Button("2");
        b2.setBounds( 115, 155, 50, 50); add(b2);
        ActionListener clk2 = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+"2");
                if(temp==false) {
                    x = x+"2";
                }
                else{
                    y=y+"2";
                }
                repaint();
            }
        };
        b2.addActionListener(clk2);

        Button b3 = new Button("3");
        b3.setBounds( 175, 155, 50, 50); add(b3);
        ActionListener clk3 = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+"3");
                if(temp==false) {
                    x = x + "3";
                }
                else{
                    y=y+"3";
                }
                repaint();
            }
        };



        b3.addActionListener(clk3);

        Button b4 = new Button("4");
        b4.setBounds( 55, 215, 50, 50); add(b4);
        ActionListener clk4 = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+"4");
                if(temp==false) {
                    x = x+"4";
                }
                else{
                    y=y+"4";
                }
                repaint();
            }
        };
        b4.addActionListener(clk4);

        Button b5 = new Button("5");
        b5.setBounds( 115, 215, 50, 50); add(b5);
        ActionListener clk5 = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+"5");
                if(temp==false) {
                    x = x + "5";
                }
                else{
                    y=y+"5";
                }
                repaint();
            }
        };
        b5.addActionListener(clk5);

        Button b6 = new Button("6");
        b6.setBounds( 175, 215, 50, 50); add(b6);
        ActionListener clk6 = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+"6");
                if(temp==false) {
                    x=x+"6";
                    //    x = x * 10 + 6;
                }
                else{
                    y=y+"6";
                    //  y=y*10+6;
                }
                repaint();
            }
        };
        b6.addActionListener(clk6);

        Button b7 = new Button("7");
        b7.setBounds( 55, 275, 50, 50); add(b7);
        ActionListener clk7 = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+"7");
                if(temp==false) {
                    x=x+"7";
                    //   x = x * 10 + 7;
                }
                else{
                    y=y+"7";
                    //    y=y*10+7;
                }
                repaint();
            }
        };
        b7.addActionListener(clk7);

        Button b8 = new Button("8");
        b8.setBounds( 115, 275, 50, 50); add(b8);
        ActionListener clk8 = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+"8");
                if(temp==false) {
                    x=x+"8";
                    //   x = x * 10 + 8;
                }
                else{
                    y=y+"8";
                    //    y=y*10+8;
                }
                repaint();
            }
        };
        b8.addActionListener(clk8);

        Button b9 = new Button("9");
        b9.setBounds( 175, 275, 50, 50); add(b9);
        ActionListener clk9 = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+"9");
                if(temp==false) {
                    x=x+"9";
                    // x = x * 10 + 9;
                }
                else{
                    y=y+"9";
                    //     y=y*10+9;
                }
                repaint();
            }
        };
        b9.addActionListener(clk9);


        Button b0 = new Button("0");
        b0.setBounds( 55, 335, 50, 50); add(b0);
        ActionListener clk0 = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+"0");
                if(temp==false) {
                    x=x+"0";
                    //   x = x * 10 + 0;
                }
                else{
                    y=y+"0";
                    //   y=y*10+0;
                }
                repaint();
            }
        };
        b0.addActionListener(clk0);

        Button bcom = new Button(".");
        bcom.setBounds( 175, 335, 50, 50); add(bcom);
        ActionListener clkcom = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+".");
                if(temp==false){
                    x=x+".";
                }
                else{
                    y=y+".";
                }
                repaint();
            }
        };
        bcom.addActionListener(clkcom);

        Button bplus = new Button("+");
        bplus.setBounds( 255, 155, 50, 50); add(bplus);
        ActionListener clkplus = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                if(r==true){
                    t1.setText(Double.toString(res));
                    x=Double.toString(res);
                }

                t1.setText(t1.getText()+"+");
                d=1;
                if(temp==true){
                    res=Double.parseDouble(x)+Double.parseDouble(y);

                    y="";
                }
                temp=true;
                repaint();
            }
        };
        bplus.addActionListener(clkplus);

        Button bminus = new Button("-");
        bminus.setBounds( 255, 215, 50, 50); add(bminus);
        ActionListener clkminus = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                if(r==true){
                    t1.setText(Double.toString(res));
                    x=Double.toString(res);
                }

                t1.setText(t1.getText()+"-");
                d=2;
                if(temp==true){
                    res=Double.parseDouble(x)-Double.parseDouble(y);
                    y="";
                }
                temp=true;
                repaint();
            }
        };
        bminus.addActionListener(clkminus);

        Button bmn = new Button("*");
        bmn.setBounds( 255, 275, 50, 50); add(bmn);
        ActionListener clkmn = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                if(r==true){
                    t1.setText(Double.toString(res));
                    x=Double.toString(res);
                }

                t1.setText(t1.getText()+"*");
                d=3;
                if(temp==true){
                    res=Double.parseDouble(x)*Double.parseDouble(y);
                    y="";
                }
                temp=true;
                repaint();
            }
        };
        bmn.addActionListener(clkmn);

        Button bdiv = new Button("/");
        bdiv.setBounds( 255, 335, 50, 50); add(bdiv);
        ActionListener clkdiv = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                if(r==true){
                    t1.setText(Double.toString(res));
                    x=Double.toString(res);
                }

                t1.setText(t1.getText()+"/");
                d=4;
                if(temp==true){
                    res=Double.parseDouble(x)*1.0/Double.parseDouble(y);
                    y="";
                }
                temp=true;
                repaint();
            }
        };
        bdiv.addActionListener(clkdiv);

        Button bce = new Button("CE");
        bce.setBounds( 115, 335, 50, 50); add(bce);
        ActionListener clkce = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                t1.setText("");
                temp=false;
                r=false;
                x="";
                y="";
                repaint();
            }
        };
        bce.addActionListener(clkce);

        Button bdor = new Button("=");
        bdor.setBounds( 325, 335, 50, 50); add(bdor);
        ActionListener clkdor = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                r=true;
                botSelected = e.getActionCommand();
                t1.setText(t1.getText()+"=");
                if(d==1) {
                    res=Double.parseDouble(x)+Double.parseDouble(y);
                    t1.setText(t1.getText() + res);
                }
                if(d==2) {
                    res=Double.parseDouble(x)-Double.parseDouble(y);
                    t1.setText(t1.getText() + res);
                }
                if(d==3) {
                    res=Double.parseDouble(x)*Double.parseDouble(y);
                    t1.setText(t1.getText() + res);
                }
                if(d==4) {
                    if(Double.parseDouble(y)==0){
                        t1.setText("Error");
                    }
                    else {
                        res = Double.parseDouble(x) * 1.0 / Double.parseDouble(y);
                        t1.setText(t1.getText() + res);
                    }
                }
            }
        };
        bdor.addActionListener(clkdor);

    }



    public  static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public  void run(){
                new Main("Laba", 1000, 600);
            }
        });
    }
}