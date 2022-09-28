package com.company;
import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

class Main extends Frame{
    String botSelected = "";

    Main(String s, int w, int h){
        super(s);
        setLayout(null);
        Font f = new Font("Serif", Font.BOLD, 15);
        setFont(f);
        setSize(650, 500);
        setVisible(true);

        Button b1 = new Button("YELLOW");
        b1.setBackground(Color.YELLOW);
        b1.setBounds( 55, 55, 150, 30); add(b1);
        ActionListener clk = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                botSelected = e.getActionCommand();
                repaint();
            }

        };
        b1.addActionListener(clk);

        Button b2 = new Button("RED");
        b2.setBackground(Color.RED);
        b2.setBounds( 255, 55, 150, 30); add(b2);
        b2.addActionListener(clk);

        Button b3 = new Button("INCRIPTION");
        b3.setBackground(Color.WHITE);
        b3.setBounds( 455, 55, 150, 30); add(b3);
        b3.addActionListener(clk);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(175, 150, 300, 300);
        if (botSelected.equals("YELLOW")) {
            g.setColor(new Color(0xFFF700));
            g.fillRect(175, 150, 301, 301);
        }
        if (botSelected.equals("RED")) {
            g.setColor(new Color(0xFF0000));
            g.fillRect(175, 150, 301, 301);
        }
        if (botSelected.equals("INCRIPTION")) {
            Label l1 = new Label("Square" +
                    "", Label.CENTER);
            l1.setBounds(270, 455, 120, 25); add(l1);
        }
    }
    public  static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public  void run(){
                new Main("Laba", 1000, 600);
            }
        });
    }
}