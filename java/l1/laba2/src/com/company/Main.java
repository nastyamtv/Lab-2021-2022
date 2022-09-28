package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a,b,c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

    if(a==0){
        if(b==0){
            if(c==0){
                System.out.println("the equation has an infinite number of solutions");
            }
            else{
                System.out.println("The equation has no solutions");
            }
        }
        else{
            System.out.printf("x= %.3f %n",(-1.0)*c/b);
        }
    }
    else{
        double d=b*b-4*a*c;
        if(d<0){
            System.out.println("Discriminant less than 0");
        }
        else{
            d=Math.sqrt(d);
            double x1=((-1.0)*b+d)/(2*a);
            double x2=((-1.0)*b-d)/(2*a);
            if(x1!=x2) {
                System.out.printf("x1= %.3f %n", x1);
                System.out.printf("x2= %.3f %n", x2);
            }
            else{
                System.out.printf("x= %.3f %n", x1);
            }
        }
    }


    }
}
