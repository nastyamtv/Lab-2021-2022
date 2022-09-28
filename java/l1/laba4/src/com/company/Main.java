package com.company;

public class Main {

    public static void main(String[] args) {
	int n=10;
    int MIN=0;
    int MAX=20;
    int arr[] = new int[n];
    System.out.print("Initial array\n");
    for (int i = 0; i < n; i++)
    {
        arr[i]= (int) (Math.random()*(MAX-MIN+1)) + MIN;
        System.out.print(arr[i]+" ");
    }

    int min_idx=0;
    int max_idx=0;
    for (int i = 1; i < n; i++)
    {
        if(arr[min_idx]>arr[i]){
            min_idx=i;
        }
        if(arr[max_idx]<arr[i]){
            max_idx=i;
        }
    }
    int temp=arr[min_idx];
    arr[min_idx]=arr[max_idx];
    arr[max_idx]=temp;
    System.out.print("\nResult array\n");
    for (int i = 0; i < n; i++){
        System.out.print(arr[i]+" ");
    }

    }
}
