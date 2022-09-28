package com.company;
import java.util.*;

class Queue {
    public String[] queue;
    public int maxSize;
    public int count;
    public int front;
    public int next;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queue = new String[maxSize];
        next = -1;
        front = 0;
        count = 0;
    }


    public void enqueue(String elem) {
        if (next == maxSize - 1) {
            next = -1;
        }

        queue[++next] = elem;
        count++;
    }


    public String dequeue() {

        if(count!=0) {
            String x = queue[front];
            front++;
            count--;
            return x;
        }
        else{
            System.out.print("Error");
            return "";
        }
    }

    public int lenQ() {
        int l=0;
        int i=front;
        while(queue[i]!=null){
            l=l+queue[i].length();
            i++;
        }
        return l;
    }

}


public class Main {

    public static void main(String[] args) {
        Queue myQueue = new Queue(6);
        myQueue.enqueue("one");
        myQueue.enqueue("two");
        myQueue.enqueue("Three");
        myQueue.enqueue("four");
        /*while (!myQueue.isEmpty()) {
            String n = myQueue.denqueue();
            System.out.print(n+" ");
        }
*/
        int i = myQueue.front;
        while(myQueue.queue[i]!=null){
            System.out.print(myQueue.queue[i]+" ");
            i++;
        }
        System.out.println("\n\nDeleted: "+myQueue.dequeue());
        System.out.println("Deleted: "+myQueue.dequeue());
        System.out.println();

        i = myQueue.front;
        while(myQueue.queue[i]!=null){
            System.out.print(myQueue.queue[i]+" ");
            i++;
        }
        myQueue.enqueue("inf");
        System.out.println();
        i = myQueue.front;
        while(myQueue.queue[i]!=null){
            System.out.print(myQueue.queue[i]+" ");
            i++;
        }
        System.out.println("\nLenght "+myQueue.lenQ());
        }
    }

