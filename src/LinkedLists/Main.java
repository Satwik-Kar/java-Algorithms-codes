package LinkedLists;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addInPos(5,3);
        ll.addInPos(0,4);

        ll.printAll();

    }
}