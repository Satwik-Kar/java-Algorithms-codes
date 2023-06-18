package LinkedLists;

/**
 * The type Ll.
 *
 * @param <T> the type parameter
 */
public class LL<T> {
    /**
     * The Head.
     */
    private Node head;
    private int size = 1;

    /**
     * The type Node.
     */
    class Node {
        /**
         * The Data.
         */
        T data;
        /**
         * The Next.
         */
        Node next;

        /**
         * Instantiates a new Node.
         *
         * @param data the data
         */
        Node(T data) {
            this.data = data;
            next = null;
        }
    }

    /**
     * Add.
     *
     * @param data the data
     */
    void add(T data) {
        addLast(data);
    }

    /**
     * Add first.
     *
     * @param data the data
     */
    void addFirst(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;


    }

    /**
     * Add last.
     *
     * @param data the data
     */
    void addLast(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        size++;


    }

    /**
     * Add in pos.
     *
     * @param data     the data
     * @param position the position
     */
    void addInPos(T data, int position) {


        if (position == 0) {
            addFirst(data);
            size++;
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int pos0 = 0;
        while (pos0 < position - 1 && current.next != null) {
            current = current.next;
            pos0++;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;


    }

    /**
     * Delete node in pos.
     *
     * @param position the position
     */
    void deleteNodeInPos(int position) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        if (position == 0) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        Node previous = null;
        int pos0 = 0;

        while (current != null) {
            if (pos0 == position) {
                previous.next = current.next;
                size--;
                return;
            }

            previous = current;
            current = current.next;
            pos0++;
        }

        System.out.println("Position " + position + " not found in the linked list.");


    }

    /**
     * Gets size.
     *
     * @return the size
     */
    int getSize() {
        return size;
    }

    /**
     * Search.
     *
     * @param searchDataElement the searchDataElement
     * @return the int
     */
    int search(T searchDataElement) {
        int pos = -1;
        Node current = head;

        while(current.next!=null){
            pos++;
            T data  = current.data;
            if(searchDataElement.equals(data)){

                return pos;

            }
            current = current.next;

        }
        return -1; // SEARCHED NODE IS NOT PRESENT IN THE LIST
    }


    /**
     * Print all.
     */
    void printAll() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            T data = currentNode.data;
            System.out.print(data + "-->>");
            currentNode = currentNode.next;
        }
        System.out.print("NULL");
    }
}
