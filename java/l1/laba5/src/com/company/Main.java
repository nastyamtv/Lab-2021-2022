package com.company;

import java.util.function.Function;

public class Main {
    public static double minimum(double a, double b, double n){
        double xmin=a;
        double min=0;
        double step=(b-a)/n;
        for(double i=1; i<Math.PI; i=i+step){
            if(F(i)<min){
                min=F(i);
                xmin=i;
            }
        }
        return xmin;
    }

    public static double F(double x){

        return Math.sin(x)+Math.pow(Math.cos(x),2);
    }

    public static void main(String[] args) {
        double a=0;
        double b=Math.PI;
        double n=100;
        double x = minimum(a,b,n);
        double y = F(x);
            System.out.println("\nx= "+x+" y= "+y);

    }
}
