package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        ArrayList <String> first = new ArrayList<String>();
        ArrayList <String> second = new ArrayList<String>();
        ArrayList <String> result = new ArrayList<String>();
        int n = menu();
        int G;
        while (n != 0) {
            switch (n) {
                case 1 -> {
                    G = menuGroup();
                    while (G != 0) {
                        switch (G) {
                            case 1 -> {
                                int s = numStudent();
                                for (int i = 1; i <= s; i++) {
                                    first.add(name());
                                }
                            }
                            case 2 ->
                                    first.remove(name());
                            case 3 -> {
                                int number = student();
                                System.out.println(first.get(number));
                            }
                            case 4 -> {
                                Object[] firstGroup = first.toArray();
                                for (Object person : firstGroup) {
                                    System.out.print(person + "\t");
                                }
                                System.out.println();
                            }
                        }
                        G = menuGroup();
                    }
                }
                case 2 -> {
                    G = menuGroup();
                    while (G != 0) {
                        switch (G) {
                            case 1 -> {
                                int s = numStudent();
                                for (int i = 1; i <= s; i++) {
                                    second.add(name());
                                }
                            }
                            case 2 ->
                                    second.remove(name());
                            case 3 -> {
                                int number = student();
                                System.out.println(second.get(number));
                            }
                            case 4 -> {
                                Object[] secondGroup = second.toArray();
                                for (Object person : secondGroup) {
                                    System.out.print(person + "\t");
                                }
                                System.out.println();
                            }
                        }
                        G = menuGroup();
                    }
                }
                case 3 -> {
                    int ch = numStudent();
                    for (int i = 1; i <= ch; i++) {
                        result.add(first.get(i));
                        result.add(second.get(i));
                        //first.add(second.get(i));
                        //second.remove(second.get(i));
                    }
                    System.out.println("Result:");
                        System.out.print(result);
                        System.out.println();
                }
            }
            n = menu();
        }

    }
    static int menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("0. Exit");
        System.out.println("1. Lottery participants");
        System.out.println("2. Prizes");
        System.out.println("3. Do the task");
        return in.nextInt();
    }
    static int menuGroup() {
        Scanner in = new Scanner(System.in);
        System.out.println("0. Return to the main menu");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Print list");
        return in.nextInt();
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
    static int student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        return in.nextInt();
    }
}
