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
        g.setColor(new Color(0x00FF00));
        int n = 3;
        int x[] = {25, 145, 275};
        int y[] = {325, 50, 325};
        g.fillPolygon(x,y,n);
        g.setColor(new Color(0xA0A0A0));
        g.fillRect(300,125,200,200);
        g.setColor(new Color(0xFF0000));
        g.fillOval(550,150,400,100);

        //text
        g.setColor(new Color(0x0080FF));


        g.setFont(new Font(g.getFont().getName(), Font. BOLD | Font. ITALIC, 15));
        g.drawString("Green Triangle", 115, 350);
        g.drawString("Grey Rectangle", 365, 350);
        g.drawString("Red Ellipse", 715, 280);
    }

    public  static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public  void run(){
                new Main("Laba", 1000, 600);
            }
        });
    }
}


