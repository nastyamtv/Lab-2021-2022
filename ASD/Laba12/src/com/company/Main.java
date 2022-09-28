package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=5;
        int m=6;
        int counta=0;
        int countb=0;
        int x=7;
        int y=4;
        int k;
        int[][] a = new int[n][m];
        int[][] b = new int[x][y];
        System.out.print("Enter k: ");
        k=in.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j]>k){
                    if((i+j)%2==1){
                        System.out.print(a[i][j]+" ");
                        counta++;
                    }
                }
            }
        }
        System.out.println("Quantity number: "+counta);

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++) {
                b[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(b[i][j]>k){
                    if((i+j)%2==1){
                        System.out.print(b[i][j]+" ");
                        countb++;
                    }
                }
            }
        }
        System.out.println("Quantity number: "+countb);
    }
}
