package Algorithms.Sort;

import static Helpers.Helper.print;

public class MergeSort {

    public static void main(String[]args){
        int[] intArray = {20, 35, -15, 7, 55,4,6 ,7,8, -1, 135, 15, 1, 1, -22};

        mergeSort(intArray,0, intArray.length);

        print(intArray);
    }

    public static void mergeSort(int[]input, int start , int end){

       //base case / break condition to stop the recursion ie. if there is only one element then return
       if(end - start < 2)
           return;


        //if array size is equal to less than 1 then return
        int mid = ( start + end ) / 2;

        //partition the array
        mergeSort(input,start,mid);
        mergeSort(input,mid,end);

        //merge the split arrays
        merge(input,start,mid,end);



    }

    private static void merge(int[] input, int start, int mid, int end) {
        //optimization 1, check if left and right array are already in correct positions
        //input[mid-i] = last index of the left array
        //intpt[mid] = first index of the right array
        if(input[mid-1] < input [mid])
            return;

        //if the arrays are not in the correct position and needs merging then proceed

        int i = start;
        int j = mid;
        int tempIndex = 0 ;

        //create a temporary array to store all the elements of left and right array
        int temp[] = new int[end - start];

        //now start the comparison and populate the temp array
        while(i< mid && j < end){
            //so here in the check '=' ensure that the sort is stable because if the element is equal
            // then we move that element to the temp array first from the left side
            temp[tempIndex++]=input[i] < input[j] ? input[i++] : input[j++];
        }

        //once the above merging is done it's time to copy over the pending elements
        //if elements are left in right array only then we need to copy because those elements need to
        //be copied after the right arrays index but if left array was pending then no need to copy those elements
        //as they are already in their correct order so..

        System.arraycopy(input,i,input,start + tempIndex, mid - i);

        //now let's copy the temp array into the main array

        System.arraycopy(temp, 0, input, start, tempIndex);

    }
}
/* NOTES
1. It's a divide and conquer algorithm.
2. Stable Algorithm because of the condition of < in the while logic
3. Splitting logic is inplace but Merging logic is out of place
4. Complexity is O(n log(n) ). We are repeatedly dividing the array in 2 hence logarithmic

 */