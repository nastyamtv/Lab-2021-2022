package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        ArrayList <String> first = new ArrayList<String>();
        int s = numStudent();
        for (int i = 1; i <= s; i++) {
            first.add(name());
        }

       for(int i=1; i<first.size(); i++){
            first.remove(i);
        }


        System.out.print(first);
    }
    static String name() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        return in.nextLine();
    }

    static int numStudent () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter quantity member: ");
        return in.nextInt();
    }
}
