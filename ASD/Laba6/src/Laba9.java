import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class Laba9 {

    public static  void sort(int[] arrayToSort) {
        int n = arrayToSort.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=8;
        int a[] = new int[n];
        System.out.println("Enter array:");
        for(int i=0; i<a.length; i++){
            a[i]=in.nextInt();
        }
        sort(a);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
