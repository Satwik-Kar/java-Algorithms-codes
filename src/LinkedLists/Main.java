package LinkedLists;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addInPos(5,3);
        ll.addInPos(0,4);


        ll.printAll();
        ll.deleteNodeInPos(4);
        System.out.println();
        ll.printAll();

    }
}