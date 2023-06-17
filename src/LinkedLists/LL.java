package LinkedLists;

public class LL {
    Node head;


    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;


        }
        Node(int data,int index){
            this.data = data;
            next = null;
        }

    }
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;



    }
    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;


    }
    void addInPos(int data,int position){

        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int pos0 = 0;
            while (pos0 < position -1  && current.next != null) {
                current = current.next;
                pos0++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

    }
    void printAll(){

        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode!= null){
            int data = currentNode.data;
            System.out.print(data+"-->>");
            currentNode = currentNode.next;
        }
        System.out.print("NULL");
    }
}
