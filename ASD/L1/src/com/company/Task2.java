package com.company;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = in.nextDouble();
        System.out.println("Result: "+((1+x)/(1+Math.pow(Math.cos(x),2))));
    }
}
