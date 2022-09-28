package com.company;
public class Main {

    public static void main(String[] args) {
	double a=1;
    int n=20;
    double sum=0;
    double d=1.5;
    for (double i = a; i < n; i=i+d){
        sum=sum+i;
    }
    System.out.printf("The sum of "+n+" numbers "+sum);
    }
}
