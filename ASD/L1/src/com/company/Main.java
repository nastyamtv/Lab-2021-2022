package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter v,u,t1,t2: ");
        double v = in.nextDouble();
        double u = in.nextDouble();
        double t1 = in.nextDouble();
        double t2 = in.nextDouble();
        System.out.println("S: "+(v*t1+(v+u)*t2));

    }
}
