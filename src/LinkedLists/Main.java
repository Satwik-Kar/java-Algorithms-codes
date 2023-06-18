package LinkedLists;

import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    static int TYPE_CHOICE;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\\\\\\\\\\ MENU //////////");
        LL linkedList = null;
        while (true) {
            int choice;
            System.out.println("*********************************************************************");
            System.out.println("Choose from the following choices to execute:");
            System.out.println("(0):Exit");
            System.out.println("(1):Create a LinkedList");
            System.out.println("(2):add element");
            System.out.println("(3):Display LinkedList");
            System.out.println("(4):Display size of LinkedList");
            System.out.println("(5):Search an element inside the LinkedList");

            choice = sc.nextInt();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.println("Which type of LinkedList you want to create?");
                    System.out.println("(1). Type Integer\n(2). Type Double\n(3). Type Float\n(4). Type String");
                    int choice_ = sc.nextInt();
                    if (choice_ == 1) {
                        linkedList = new LL<Integer>();
                        TYPE_CHOICE = 1;
                        System.out.println("LinkedList created successfully.");
                    } else if (choice_ == 2) {
                        linkedList = new LL<Double>();
                        TYPE_CHOICE = 2;
                        System.out.println("LinkedList created successfully.");

                    } else if (choice_ == 3) {
                        linkedList = new LL<Float>();
                        TYPE_CHOICE = 3;
                        System.out.println("LinkedList created successfully.");

                    } else if (choice_ == 4) {
                        linkedList = new LL<String>();
                        TYPE_CHOICE = 4;
                        System.out.println("LinkedList created successfully.");

                    }
                }
                case 2 -> {
                    if (linkedList == null) {
                        System.out.println("Initialize a LinkedList, then try to add elements.:");

                    } else {
                        System.out.println("Enter an element according to the your given type of LinkedList:");
                        Object data = 0;
                        if (TYPE_CHOICE == 1) {
                            data = sc.nextInt();
                            linkedList.add(data);
                            System.out.println("Element successfully inserted.");

                        } else if (TYPE_CHOICE == 2) {
                            data = sc.nextDouble();
                            linkedList.add(data);
                            System.out.println("Element successfully inserted.");

                        } else if (TYPE_CHOICE == 3) {
                            data = sc.nextFloat();
                            linkedList.add(data);
                            System.out.println("Element successfully inserted.");

                        } else if (TYPE_CHOICE == 4) {
                            data = sc.next();
                            linkedList.add(data);
                            System.out.println("Element successfully inserted.");

                        }

                    }


                }
                case 3 -> {
                    if (linkedList != null) {
                        linkedList.printAll();
                        System.out.println();
                    } else {
                        System.out.println("LinkedList is empty.Try initializing the LinkedList first.");
                    }
                }
                case 4 -> {
                    if (linkedList == null) {
                        System.out.println("Initialize a LinkedList, then try to find size of LinkedList");
                    } else {
                        int size = linkedList.getSize();
                        System.out.println("Size of the LinkedList is " + size);

                    }

                }
                case 5 -> {
                    if (linkedList == null) {
                        System.out.println("Initialize a LinkedList, then try to find a element of LinkedList");
                        break;
                    }
                    System.out.println("Enter an element to search:");
                    Object element = 0;
                    if (TYPE_CHOICE == 1) {
                        element = sc.nextInt();
                    } else if (TYPE_CHOICE == 2) {
                        element = sc.nextDouble();
                    } else if (TYPE_CHOICE == 3) {

                        element = sc.nextFloat();
                    } else if (TYPE_CHOICE == 4) {
                        element = sc.next();
                    }
                    int found = linkedList.search(element);
                    if (found == -1) {
                        System.out.println("The element not found in the LinkedList");
                    } else {
                        System.out.println("Element found at index:" + found);
                    }
                }
                default -> System.out.println("Wrong choice");
            }

        }
    }

}