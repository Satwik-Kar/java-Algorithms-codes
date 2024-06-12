package Revision;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//adjacency list
public class BinarySearchTree {
    static class AdjacencyList{
        int noOfVertices;
        static ArrayList<Integer>[] adjacencyList;

        AdjacencyList(int noOfVertices){

            this.noOfVertices = noOfVertices;
            adjacencyList = new ArrayList[noOfVertices];


        }



        public  void connect(int source, int destination){

            try {
                adjacencyList[source].add(destination);
            }catch(NullPointerException e){
                ArrayList<Integer> a = new ArrayList<>();
                a.add(destination);
                adjacencyList[source] = a;


            }


        }
        public void print(){
            for(int i = 0;i<adjacencyList.length;i++){
                System.out.println(i+"->"+adjacencyList[i]);
            }
        }

    }


    public static void main(String[] args) {
        AdjacencyList a = new AdjacencyList(5);
        a.connect(0,2);
        a.connect(2,2);
        a.connect(2,3);

        a.print();

        AdjancencyMatrix b = new AdjancencyMatrix(5);
        b.connect(0,2);
        b.connect(2,2);
        b.connect(2,3);

        b.print();


    }


    static class AdjancencyMatrix{
        int noOfVertices;
        static int[][] adjacencyMatrix ;
        AdjancencyMatrix(int noOfVertices){

            adjacencyMatrix  = new int[noOfVertices][noOfVertices];


        }

        public void connect(int source,int destination){

            adjacencyMatrix[source][destination] = 1;
            adjacencyMatrix[destination][source] = 1;

        }
        void print(){

            for(int i = 0;i<adjacencyMatrix.length;i++){
                for(int j = 0;j<adjacencyMatrix.length;j++){
                    System.out.print(adjacencyMatrix[i][j]);
                }
                System.out.println();
            }



        }




    }




}
