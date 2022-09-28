package com.company;
import org.w3c.dom.events.MouseEvent;

import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

    class Main extends JFrame{
    String botSelected = "";

        JMenu menu, submenu;
        Label l1;
        JMenuItem i1, i2, i3, i4, i5;

    Main(String s, int w, int h){
        super(s);
        setLayout(null);
        Font f = new Font("Serif", Font.BOLD, 15);
        setFont(f);
        setSize(650, 500);
        setVisible(true);

        Label l2 = new Label("Q - Yellow, W - Red, E - Inscription ");
        l2.setBounds(30, 30, 300, 30); add(l2);
        l1 = new Label(" ", Label.CENTER);
        l1.setBounds(260, 90, 120, 25); add(l1);


        JFrame f1 = new JFrame("Menu and MenuItem Example");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("yellow");
        i2 = new JMenuItem("red");
        i3 = new JMenuItem("inscription");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        mb.add(menu);
        mb.setBounds(0,0,700,30); add(mb);
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botSelected =  e.getActionCommand().toUpperCase();
                repaint();

            }
        };

        i1.addActionListener(al);
        i2.addActionListener(al);
        i3.addActionListener(al);

            AWTEventListener keyboardListener = new AWTEventListener() {
            @Override
            public void eventDispatched(AWTEvent ev) {
                if (ev instanceof KeyEvent) {
                    KeyEvent key = (KeyEvent) ev;
                    if (key.getID() == KeyEvent.KEY_PRESSED && KeyEvent.getKeyText(key.getKeyCode()).equals("Q")) {
                        botSelected = "YELLOW";
                        repaint();

                    }
                    if (key.getID() == KeyEvent.KEY_PRESSED && KeyEvent.getKeyText(key.getKeyCode()).equals("W")) {
                        botSelected = "RED";
                        repaint();
                    }
                    if (key.getID() == KeyEvent.KEY_PRESSED && KeyEvent.getKeyText(key.getKeyCode()).equals("E")) {
                        botSelected = "INSCRIPTION";
                        repaint();
                    }
                }
            }
        };

        Toolkit.getDefaultToolkit().addAWTEventListener(keyboardListener, AWTEvent.KEY_EVENT_MASK);
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
        if (botSelected.equals("INSCRIPTION")) {
            l1.setText("Square:");
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