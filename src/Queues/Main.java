package Queues;

public class Main {

    public static void main(String[] args) {



        Queue q = new Queue();
        int[] i = new int[Queue.MAX];
        q.insert(i);
//        q.insert(i);
//        q.insert(i);
//        q.insert(i);
//        q.insert(i);
        q.remove(i);
        q.display(i);
    }
}
