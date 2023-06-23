package Algorithms.Sort;

import DataStructures.Heaps.Heap;

public class HeapSort {
    public static void main(String[] args) {

        Heap heap = new Heap(8);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();

        heap.heapSort();

        heap.printHeap();
    }
}

/* NOTES
* 1. Time Complexity O( n * log(N) ) due to N elements and heapifying log(N)
* 2. In Place algorithm as we are not using any additional memory
* 3. Building a heap just to sort it might not be the best solution because we can use other sorts.
* 4. After soring the heap is no longer a heap as structure is blown away
* */
