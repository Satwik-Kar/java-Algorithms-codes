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
        LL<Integer> linkedListOfTypeInteger = new LL<>();
        linkedListOfTypeInteger.addFirst(1);
        linkedListOfTypeInteger.addFirst(2);
        linkedListOfTypeInteger.addFirst(3);
        linkedListOfTypeInteger.addFirst(4);
        linkedListOfTypeInteger.addInPos(5,3);
        linkedListOfTypeInteger.addInPos(0,4);

        LL<Double> linkedListOfTypeDouble = new LL<>();
        linkedListOfTypeDouble.addFirst(1.0);
        linkedListOfTypeDouble.addFirst(2.0);
        linkedListOfTypeDouble.addFirst(3.0);
        linkedListOfTypeDouble.addFirst(4.0);
        linkedListOfTypeDouble.addInPos(5.0,3);
        linkedListOfTypeDouble.addInPos(0.0,4);

        linkedListOfTypeInteger.printAll();
        linkedListOfTypeInteger.deleteNodeInPos(4);
        System.out.println();
        linkedListOfTypeInteger.printAll();
        System.out.println();
        int searchElementInteger = linkedListOfTypeInteger.search(2);
        System.out.println(searchElementInteger + " size = " + linkedListOfTypeInteger.getSize());

        linkedListOfTypeDouble.printAll();
        linkedListOfTypeDouble.deleteNodeInPos(4);
        linkedListOfTypeDouble.deleteNodeInPos(3);

        System.out.println();
        linkedListOfTypeDouble.printAll();
        System.out.println();
        int searchElementDouble = linkedListOfTypeDouble.search(2.0);
        System.out.println(searchElementDouble + " size = " + linkedListOfTypeDouble.getSize());
    }
}