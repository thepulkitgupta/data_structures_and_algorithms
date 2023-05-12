package Algorithms.Sort;

import static Helpers.Helper.print;

public class CountingSort {
    public static void main(String[]args){
        int[] intArray = {13,11,15,17,20,24,24,11,16,17,13,15};

//        countingSort(intArray,11,24);
        countingStableSort(intArray,11,24);
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

    private static void countingStableSort(int[] input, int min, int max) {

        //first we create a counting array using the min and max values
        int[] countingArray = new int[ (max-min) + 1];

        //traverse the main array and update the count in counting array
        for(int i=0;i<input.length;i++){
            countingArray[input[i]-min]++;
        }

        print(countingArray);

        //update the counts in the array to store the values <= at each index
        for(int i=1;i<countingArray.length;i++){
            countingArray[i]+=countingArray[i-1];
        }

        print(countingArray);

        //create a temp array to store the values of the input array in the stable sorted order
        int [] tempArray = new int[input.length];

        //traverse the array from RightToLeft and fetch the count and store based on the count values
        for(int j=input.length-1;j>=0;j--){
            tempArray[--countingArray[input[j]-min]]=input[j];
        }

        //store the values back in the array
        for(int i=0;i<input.length;i++){
            input[i]=tempArray[i];
        }
    }
}

/* NOTES
* 1. Counting sort makes assumption about the data, in this case it is for whole numbers i.e. non-negative discreet numbers
* 2. It sorts array in a linear time without performing any comparisons
* 3. NOt an in-place algorithm because a new array's size depends on the value of n
* 4. Best to use when the no. of elements in the array are equal to the range of values of elements
* 5. This sort can be made stable when using linked list or updating the logic to store <=values in countArray
* 6. Traversal from Right To Left is also need to make it stable
* */
