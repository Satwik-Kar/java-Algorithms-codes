package Queues;

import java.util.Scanner;

public class Queue {
    public static int front = -1, rear = -1;// Initialize  front and rear.
    public static final int MAX = 5;

//    public void insert(int Q[]) {
//        Scanner sc = new Scanner(System.in);
//        if (is_full()) {// Checking the Queue is full or not by calling isfull().
//            System.out.println("overflow");
//            return;
//        } else if (rear == -1) {// If it is the first element to be inserted then make front and rear both 0.
//            rear = 0;
//            front = 0;
//        } else// Otherwise only increment rear;
//            rear++;
//        System.out.println("Enter the elemenet to insert");
//        Q[rear] = sc.nextInt();// take the element from user.
//
//    }

    public void remove(int[] q) {
        int item = 0;
        if (is_empty()) {
            System.out.println("queue is empty.");
        } else if (front == rear) {
            item = q[front];
            front = -1;
            rear = -1;
            System.out.println(item+"is deleted nothing left");

        } else {

            item = q[front];
            front++;
            System.out.println(item+"is deleted");

        }


    }
    public void insert(int q[]){
        if (is_full()){

            System.out.println("Queue is full:overflow");
            return;
        }

        if(rear == -1){
            front = 0;
            rear = 0;
            Scanner sc = new Scanner(System.in);
            q[front] = sc.nextInt();
            System.out.println("Inserted Successfully");
        } else {

            rear++;
            Scanner sc = new Scanner(System.in);
            q[front] = sc.nextInt();
            System.out.println("Inserted Successfully");
        }

    }

    public static boolean is_full() {
        if (rear == MAX - 1)// Queue is full
            return true;
        else return false;
    }

    public static boolean is_empty() {
        if (front == -1 || front > rear)//Queue is empty
            return true;
        return false;
    }

    public void display(int Q[]) {
        if (is_empty())
            System.out.println("empty");
        else {
            for (int i = front; i <= rear; i++)// Display all the elements from front to rear.
                System.out.println(Q[i]);
        }
    }


}
