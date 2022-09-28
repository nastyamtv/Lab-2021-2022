package com.company;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.*;

public class Main {

    public  static int max(TreeSet<Integer> t){
        Iterator<Integer> it= t.iterator();
        int max=t.first();

        while (it.hasNext()){
            int temp=it.next();
            if(temp>max){
                max=temp;
            }
        }

        return max;
    }


    public static void main(String[] args) {
        int MIN=-20;
        int MAX=20;
        TreeSet<Integer> tree= new TreeSet<Integer>();
        int n=10;

        for(int i=n; i>0; i--){
            tree.add(0+(int)(Math.random()*(MAX-MIN+1)) + MIN);
        }

        System.out.println(tree);
        System.out.println();
        System.out.println("max: "+max(tree));
        System.out.println();

        int pension=60;
        System.out.print("Pension: "+pension+"\n");
        int arr[] ={30, 34, 58, 21, 11, 10, 2};

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        TreeSet<Integer> t = new TreeSet<Integer>();
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("\nResult:");
        System.out.print("[");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
}
