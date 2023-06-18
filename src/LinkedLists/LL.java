package LinkedLists;

/**
 * The type Ll.
 */
public class LL {
    /**
     * The Head.
     */
    Node head;

    /**
     * The type Node.
     */
    static class Node{
        /**
         * The Data.
         */
        int data;
        /**
         * The Next.
         */
        Node next;

        /**
         * Instantiates a new Node.
         *
         * @param data the data
         */
        Node(int data){
            this.data = data;
            next = null;


        }

        /**
         * Instantiates a new Node.
         *
         * @param data  the data
         * @param index the index
         */
        Node(int data,int index){
            this.data = data;
            next = null;
        }

    }

    /**
     * Add first.
     *
     * @param data the data
     */
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;



    }

    /**
     * Add last.
     *
     * @param data the data
     */
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

    /**
     * Add in pos.
     *
     * @param data     the data
     * @param position the position
     */
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

    /**
     * Delete node in pos.
     *
     * @param position the position
     */
    void deleteNodeInPos(int position){
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        int pos0 = 0;

        while (current != null) {
            if (pos0 == position) {
                previous.next = current.next;
                return;
            }

            previous = current;
            current = current.next;
            pos0++;
        }

        System.out.println("Position " + position + " not found in the linked list.");


    }

    /**
     * Print all.
     */
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
