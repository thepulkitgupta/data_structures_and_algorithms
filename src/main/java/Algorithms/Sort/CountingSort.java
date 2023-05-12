package Algorithms.Sort;

import static Helpers.Helper.print;

public class CountingSort {
    public static void main(String[]args){
        int[] intArray = {13,11,15,17,20,24,24,11,16,17,13,15};

        countingSort(intArray,11,24);

        print(intArray);
    }

    private static void countingSort(int[] input, int min, int max) {

        //first we create a counting array using the min and max values
        int[] countingArray = new int[ (max-min) + 1];

        //traverse the main array and update the count in counting array
        for(int i=0;i<input.length;i++){
            countingArray[input[i]-min]++;
        }

        print(countingArray);
        //use the counting array to populate back the input array, traverse using the values
        int j=0;
        for(int x=min;x<=max;x++){
            while(countingArray[x-min]>0){
                input[j++]=x;
                countingArray[x-min]--;
            }
        }
    }
}

/* NOTES
* 1. Counting sort makes assumption about the data, in this case it is for whole numbers i.e. non-negative discreet numbers
* 2. It sorts array in a linear time without performing any comparisons
* 3. NOt an in-place alogrithm because a new array's size depends on the value of n
* 4. Best to use when the no. of elements in the array are equal to the range of values of elements
* 5. This sort can be made stable when using linked list.
* */
