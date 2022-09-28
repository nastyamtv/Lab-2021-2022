package com.company;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class Main {

    public static  void sort(int[] arrayToSort) {
        int n = arrayToSort.length;


        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                    for(int l=0; l<arrayToSort.length; l++){
                        System.out.print(arrayToSort[l]+" ");
                    }
                    System.out.println();
                }
                arrayToSort[j] = key;
            }
        }
    }


    public static void main(String[] args) {
        int MIN=0;
        int MAX=20;
        Scanner in = new Scanner(System.in);
        int n=8;
        int a[] = new int[n];
        System.out.println("Enter array:");
        for(int i=0; i<a.length; i++){
            a[i]=in.nextInt();
        }
        sort(a);
        System.out.println();
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        int arr[] = new int[n];
        System.out.print("\n\nInitial array\n");
        for (int i = 0; i < n; i++)
        {
            arr[i]= (int) (Math.random()*(MAX-MIN+1)) + MIN;
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        sort(arr);
        System.out.println();
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
