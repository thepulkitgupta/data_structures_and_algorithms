package DataStructures.Heaps;

import java.util.NoSuchElementException;

public class Heap {

    //array to store the values
    int[] heap;

    //variable to track the next available slot
    int size;

    public Heap(int capacity){
        heap = new int[capacity];
    }

    //method to check if the heap is full
    public boolean isFull(){
        return size == heap.length;
    }

    //method to get the index of the parent as per the Floor( i - 1 ) / 2
    public int getParentIndex(int childIndex){
        return (childIndex-1)/2;
    }

    //add an alement to the heap
    public void insert(int value){
        if(isFull()){
            throw new IndexOutOfBoundsException("Heap is Full");
        }
        //add the value to the next available slot
        heap[size]=value;

        //heapify the array to make sure that data is correct and as per the heap from below
        fixHeapAbove(size);

        size++;
    }

    private void fixHeapAbove(int newChildIndex) {
        int newValue = heap[newChildIndex];
        while(newChildIndex > 0 && heap[newChildIndex] > heap[getParentIndex(newChildIndex)]){
            heap[newChildIndex]=heap[getParentIndex(newChildIndex)];
            newChildIndex=getParentIndex(newChildIndex);
        }
        heap[newChildIndex]=newValue;
    }

    public int delete(int index){
        //check if array is already empty or not
        if(isEmpty()){
            throw new NoSuchElementException("Heap is Empty");
        }

        //if heap is not empty then we need to set the index to replacement node
            // as elements are stored from left to right in the array the rightmost node will be the last element
        int removedValue = heap[index];

        heap[index]=heap[size-1];

        //after replacing we need to heapify and decided how to heapify it below or above

        //if parent value is lower than the replacement node then we fix the heap above
        if(heap[getParentIndex(index)] < heap[index]){
            fixHeapAbove(index);
        }
        else if(index ==0 || heap[index] < heap[getParentIndex(index)]) {
            fixHeapBelow(index, size-1);
        }

        size--;

        return removedValue;
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {

        //get the left and right child so that we can compare their values and check if they even exist or not
        int childToSwapIndex;

        while(index <= lastHeapIndex) {

            int leftChildIndex = getChild(index, true);
            int rightChildIndex = getChild(index, false);

            //child index calculation is very generic so we need to check if the index is actually part of the heap or not
            if (leftChildIndex <= lastHeapIndex) {
                //if left child exists and if right child does not that we need that the node we need to swap with is left
                if (rightChildIndex > lastHeapIndex){
                    childToSwapIndex = leftChildIndex;
                }
                //check which one has the largest value
                else {
                    childToSwapIndex = heap[leftChildIndex] > heap[rightChildIndex] ? leftChildIndex : rightChildIndex;
                }
                //check if the value is actually lower than the replacement node
                if (heap[childToSwapIndex] > heap[index]) {
                    int tmp = heap[childToSwapIndex];
                    heap[childToSwapIndex] = heap[index];
                    heap[index] = tmp;
                }
                //if value is not lower than we have nothing to do simply break out
                else {
                    break;
                }

                index = childToSwapIndex;
            }
            //if there are no children then we have nothing to do as well
            else break;
        }

    }

    public void printHeap(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]+",");
        }
        System.out.println();
    }

    private int getChild(int index, boolean left){
       return 2*index + (left ? 1 : 2);
    }


    private boolean isEmpty() {
        return size==0;
    }

    public int peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is Empty");
        }
        else return heap[0];
    }

    public void heapSort() {
        //last index where element is present = size -1 as size is the next available index in the heap
        int lastHeapIndex = size-1;
        //loop the elements in the heap until the last element because by then heap is sorted
        for(int i =0; i<lastHeapIndex; i++){

            //swap the first and the lastHeapIndex element
            int temp = heap[0];
            heap[0]=heap[lastHeapIndex - i];
            heap[lastHeapIndex-i]=temp;

            //heapify the heap but leave the elemnt that was put to the end because it's in correct position
            fixHeapBelow(0, lastHeapIndex-i-1);
        }
    }
}
