package DataStructures.Heaps;

public class Heaps {

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

        heap.delete(0);
        heap.printHeap();

        System.out.println(heap.peek());

    }
}

/*
* 1. Heaps are special type of binary trees
* 2. Tree are always complete
* 3. There is a either a max heap or min heap
* 4. Elements are added from left to right and parent > or < their children depending on heap type
* 5. Min and Max can be calculated in constant time because it will always be at the root
* 6. Usually we will be removing the root of heap only but in our implementation we can remove any index.
* 7. Insertion is O(log(N) because of heapifying
* 8. Deletion will be O(N) * log(N) due to finding the element and then heapifying it but usually we will be deleting root
* 9. If random accesses needed then heap is not the preferred structure.
* */
