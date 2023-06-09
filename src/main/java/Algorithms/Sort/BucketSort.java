package Algorithms.Sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

    public static void main(String[] args) {
        int[] intArray = {54,49, 98, 87, 71, 69,34, 46,83,66,95,92,43};

        bucketSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void bucketSort(int[] input){

        //create the buckets
        List<Integer>[] buckets = new List[10];

        //initialize each bucket
        for (int i = 0; i < buckets.length; i++) {

            buckets[i]= new LinkedList<Integer>();

//            buckets[i]=new ArrayList<Integer>();

//            buckets[i]=new Vector<Integer>();
        }

        //scatter the elements in the buckets
        for (int i = 0; i < input.length; i++) {
            //get the has for the input[i] i.e. tens place of the number in this case
            //add it to that bucket
            buckets[hash(input[i])].add(input[i]);

        }

        //sort each bucket
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        //combine the buckets
        int j =0;
        for (int i = 0; i < buckets.length; i++) {
            for(Integer value : buckets[i]){
                input[j++]=value;
            }
        }

    }

    public static int hash(int value){
        return value / (int) 10;
    }
}
/* NOTES
1. Bucket Sort is a generalisation of Radix Sort
2. Not in Place and depending on the list of linked list it could go beyond Linear Time
3. Generally insertion sort is used for sorting because insertion sort is good for small no. of elements
4. Just like radix sort we make assumption about our data
5. Collections.sort() users iterative,adaptive, stable merge sort
6. In the hash function modding by array length guarantees that we will always get values without array range
 */