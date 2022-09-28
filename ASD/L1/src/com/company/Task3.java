package com.company;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if((x1+y1==x2+y2)||(y1-x1==y2-x2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
