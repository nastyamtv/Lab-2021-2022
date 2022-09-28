package com.company;
import java.util.Scanner;
public class Main {
    public static void randomArray(int n, int[] x) {
        int MIN = -20;
        int MAX = 20;
        for (int i = 0; i < n; i++) {
            x[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.print(x[i] + " ");
        }
    }

    public static int minimumArray(int n, int[] x) {
        int min=x[0];
        for (int i = 1; i < n; i++) {
            if(x[i]<min){
                min=x[i];
            }
        }
        return min;
    }

    public static void sortArray(int n, int x[]){
        int temp=0;
        for (int i = 0; i < x.length; i++){
            for (int j = i + 1; j < x.length; j++)
            {

                if (x[i] < x[j])
                {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while(true) {
            System.out.println("Enter x: ");
            int x = in.nextInt();
            switch (x) {
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    System.out.println("Task 1");
                    System.out.println("Enter n: ");
                    int nn = in.nextInt();
                    int arr[] = new int[nn];
                    randomArray(nn, arr);
                    int sum=0;
                    int ind_s=0;
                    int ind_f=0;
                    for(int i=1; i<nn; i+=2){
                        sum+=arr[i];
                    }
                    System.out.println("\nSum 1= "+sum);
                    for(int i=0; i<nn; i++){
                        if(arr[i]<0){
                            ind_s=i;
                            break;
                        }
                    }
                    for(int i=nn-1; i>0; i--){
                        if(arr[i]<0){
                            ind_f=i;
                            break;
                        }
                    }
                    sum=0;
                    for(int i=ind_s+1; i<ind_f; i++)
                    {
                        sum=sum+arr[i];
                    }

                    System.out.println("\nSum 2= "+sum);
                    break;
                case 2:
                    System.out.println("Task 2");
                    System.out.println("Enter n: ");
                    int n1 = in.nextInt();
                    int arr1[] = new int[n1];
                    randomArray(n1, arr1);
                    sortArray(n1,arr1);
                    System.out.print("\nNew array:\n");
                    for(int i=0; i<n1; i++){
                        System.out.print(arr1[i] + " ");
                    }
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.println("Task 3");
                    System.out.println("Enter n and m: ");
                    int n = in.nextInt();
                    int m=in.nextInt();
                    int arr3[][] = new int[n][m];
                    int max=10;
                    int min=-2;
                    System.out.print("Initial matrix:\n");
                    for (int i=0; i<n; i++){
                        for (int j=0; j<arr3[i].length; j++){
                            arr3[i][j]=(int) (Math.random()*(max-min+1)) + min;
                            System.out.print(arr3[i][j]+"\t");
                        }
                        System.out.print("\n");
                    }
                    int countl=0;
                    boolean b=false;
                    for (int i=0; i<n; i++){
                        for (int j=0; j<arr3[i].length; j++){
                            if(arr3[i][j]<0){
                                b=true;
                                break;
                            }
                        }
                        if(b==true){
                            countl++;
                            b=false;
                        }
                    }
                    System.out.print("Count of lines = " +countl+"\n");
                    int[] ser=new int[n];
                    int tempSer=1;
                    for (int i=0; i<n; i++){
                        for (int j=1; j<arr3[i].length; j++){
                            if(arr3[i][j-1]==arr3[i][j]){
                                tempSer++;
                            }
                            else{
                                tempSer=1;
                            }
                            if(tempSer>ser[i])
                            {
                                ser[i]=tempSer;
                            }
                        }
                        tempSer=1;
                    }

                    System.out.print("Minimum series = "+minimumArray(n, ser)+"\n");
                    break;
                case 4:
                    System.out.println("Task 4");
                    System.out.println("Enter n: ");
                    int nx = in.nextInt();
                    int arr4[][] = new int[nx][nx];
                    int k=nx-1;
                    int l=1;
                    for (int i=k; i>nx/2; i--){
                        for (int j=l; j<nx-l; j++){
                            arr4[i][j]=1;
                        }
                        k--;
                        l++;
                    }
                    System.out.println("\nHR\n");
                    for (int i=0; i<nx; i++){
                        for (int j=0; j<arr4[i].length; j++){
                            System.out.print(arr4[i][j]+"\t");
                        }
                        System.out.println("\n");
                    }
                    break;
            }
            if(x==0){break;}
        }
    }



}
