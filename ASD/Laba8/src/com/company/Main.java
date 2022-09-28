package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	// write your code here
        int n=8;
        int[] a = new int[n];
        int[] b = new int[n];
        List<Integer> la=new ArrayList<Integer>();
        List<Integer> lb=new ArrayList<Integer>();
        List<Integer> res=new ArrayList<Integer>();
        System.out.println("Enter a:");
        for(int i=0; i<a.length; i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter b:");
        for(int i=0; i<b.length; i++){
            b[i]=in.nextInt();
        }

        for(int i=0; i<a.length; i++){
            for(int j=1+i; j<a.length; j++) {
                if(a[i]==a[j]){
                    if(la.contains(a[i])==false) {
                        la.add(a[i]);
                    }
                }
            }
        }

        for(int i=0; i<a.length; i++){
            for(int j=1+i; j<a.length; j++) {
                if(a[i]==a[j]){
                    if(lb.contains(a[i])==false) {
                        lb.add(a[i]);
                    }
                }
            }
        }

        for(int i=0; i<la.size(); i++){
            for(int j=0; j<lb.size(); j++){
                if(la.get(i)==lb.get(j)){
                    System.out.println(la.get(i));
                    res.add(la.get(i));
                }
            }
        }

        int temp;
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.size(); j++){
                if(res.get(i)<res.get(j)){
                    temp=res.get(i);
                    res.set(i, res.get(j));
                    res.set(j, temp);
                }
            }
        }

        System.out.println(res);
    }
}
