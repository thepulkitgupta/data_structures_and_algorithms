package DataStructures.Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueJDK{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2-o1;
            }
        });


        pq.add(1);
        pq.add(100);
        pq.add(0);
        pq.add(-135);
        pq.add(-11);
        pq.add(22);

//        pq.forEach(System.out::println);

//        pq.remove();
//          pq.poll();

          pq.remove(-11);
        Object[] array = pq.toArray();
        for (int i = 0; i < pq.toArray().length; i++) {
            System.out.print(array[i] +",");
        }
//        pq.forEach(System.out::println);


    }



}

/* NOTES
* 1. Priority Queues internally uses Min Heap which can be overridden by providing a comparator
* 2. Example : Emergency Room
* 3. JDK Priority Queue is Synchronised,Unbounded and Resizable
* 4. In order for a priority queue to store values the object used needs to implement Comparable interface
* */