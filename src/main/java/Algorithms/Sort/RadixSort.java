package Algorithms.Sort;

import static Helpers.Helper.print;

public class RadixSort {

    public static void main(String[]args){
        int[] intArray = {4725,4586,1330,8792,1594,5729};

        radixSort(intArray,10,4);


        print(intArray);

        String[] arr = {"bcdef", "dbaqc","abcde","omadd", "bbbbb"};

        stringRadixSort(arr,26,5);

        print(arr);

    }

    public static void radixSort(int[]  input, int radix, int width){
        //width is used so that we can pass the position of the number place we want to extract
        for(int i=0;i<width;i++){
            radixSingleSort(input,i,radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix) {

        //create a counting array
        int[] countArray= new int[radix];

        //store the count of the digit at the passed position
        for(int i=0;i<input.length;i++){
            countArray[getDigit(input[i],position,radix)]++;
        }

        //adjust the counting array
        for(int j=1; j<radix;j++){
            countArray[j]+=countArray[j-1];
        }

       //create an new temp array to hold the values of the input array in sorted order
        int[] tempArray = new int[input.length];

        //traverse the input array from RightToLeft and insert based on the count
        for(int tempIndex= tempArray.length-1;tempIndex>=0;tempIndex--){
            tempArray[--countArray[getDigit(input[tempIndex],position,radix)]]=input[tempIndex];
        }

        //copy the temp array back to input array and repeat with the next least significant digit
        for(int i=0;i< input.length;i++){
            input[i]=tempArray[i];
        }
    }

    private static int getDigit(int value, int position, int radix) {
        return value / (int) Math.pow(radix,position) % radix;
    }


    public static void stringRadixSort(String [] input, int radix, int width){
        for(int i=width;i>0;i--){
            radixStringSort(input,radix,i-1);
        }
    }

    private static void radixStringSort(String[] input, int radix, int position) {

        int [] countArray = new int[radix];

        for(int j=0;j<input.length;j++){
            countArray[getCharacter(input[j],position)]++;
        }

        for(int j=1;j< countArray.length;j++){
            countArray[j]+=countArray[j-1];
        }

        String []tempArray = new String[input.length];

        for(int k=input.length-1;k>=0;k--){
            tempArray[--countArray[getCharacter(input[k],position)]]=input[k];
        }

        for(int l=0;l<input.length;l++){
            input[l]=tempArray[l];
        }
    }

    private static int getCharacter(String s, int position) {
        return s.charAt(position) - 'a';
    }

}
/* NOTES
* 1. Not In-Place Algorithm
* 2. Stable Algorithm
* 3. O(n) linear time but performs bad then O(nlogn) because of extra overhead
* */