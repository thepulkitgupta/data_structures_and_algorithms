package Algorithms.Sort;

import static Helpers.Helper.print;

public class QuickSort {
    public static void main(String[]args){
        int[] intArray = {20, 35, -15, 7, 55,4,6 ,7,8, -1, 135, 15, 1, 1, -22};

        quickSort(intArray,0, intArray.length);

        print(intArray);
    }

    private static void quickSort(int[] intArray, int start, int end) {
        //base case
        if(end-start < 2)
            return ;
        int pivotIndex = partition(intArray,start,end);
        quickSort(intArray,start,pivotIndex);
        quickSort(intArray,pivotIndex+1,end);
    }

    private static int partition(int[] input, int start, int end) {

        //setting first element as the pivot element
        int pivot=input[start];

        int i =start;
        int j= end;
        //while elements have not crossed each other meaning that it's sorted now
        while(i<j){

            //traverse from right to left to find the element smaller than pivot
            while(i<j && input[--j] >= pivot);
            if(i<j){
                input[i]=input[j];
            }

            //traverse from left to right and find the element greater than pivot
            while(i<j && input[++i]<=pivot);
            if(i<j){
                input[j]=input[i];
            }
        }
        //we can use either i or j to set the pivot element because at the crossing i = j because everywhere we are
        //checking if i < j so when they become equal we break;
        input[j]=pivot;

        return j;
    }
}

/* NOTES
* 1. O(n*log(n)): worset case it can be quadratic but in average it is O(n*log(n)) and is generally better than merge
* 2. In-Place algorithm
* 3. Unstable algorithm
* */