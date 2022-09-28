package com.company;

public class Main {

    public static void main(String[] args) {
	double eps=50;
    double a=13.0/8;
    double sum=0;
    double k=1;
    while(eps>a){
        sum=sum+a;
        k++;
        a=(3*k*k*k+10)/(8*k);
    }
    System.out.println("eps= "+eps);
    System.out.printf("Result= %.3f %n",sum);
    }
}
