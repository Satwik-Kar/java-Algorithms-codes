package Trees;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTraversal {
    Node root;
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            left = right = null;

        }
    }
    void bfs (){
        if (root==null){
            return;
        }

        Queue<Node> queue =  new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node node = queue.poll();

            System.out.print(node.data+" ");
            if (node.left !=null){
                queue.add(node.left);
            }

            if (node.right!=null){
                queue.add(node.right);
            }
        }












    }
    void dfs(){
        if (root==null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node node = stack.pop();
            System.out.print(node.data+" ");
            if (node.right!=null){
                stack.push(node.right);
            }
            if (node.left!=null){
                stack.push(node.left);
            }

        }
    }

    public static void main(String[] args) {
        BinaryTreeTraversal b= new BinaryTreeTraversal();
        b.root = new Node(1);
        b.root.left = new Node(2);
        b.root.right = new Node(3);
        b.root.left.left = new Node(4);
        b.root.right.right = new Node(5);
        System.out.println("Breadth First Search Traversal:");
        b.bfs();
        System.out.println();
        System.out.println("Depth First Search Traversal:");

        b.dfs();

    }


}
