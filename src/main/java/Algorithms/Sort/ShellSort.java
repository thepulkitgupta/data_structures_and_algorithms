package Algorithms.Sort;

import static Helpers.Helper.print;
import static Helpers.Helper.swap;

public class ShellSort {

    public static void main(String []args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22, -19, 8 , 7 , 100, 2 , 4 , 79 , 18};

//        shellInsertion(intArray);
//        shellInsertionReverse(intArray);
        shellBubble(intArray);
        print(intArray);
    }

    //add a method for shell sort for insertion sort
    public static void shellInsertion(int[] intArray){
        for(int gap= intArray.length/2;gap>0;gap/=2){
            for(int i=gap;i< intArray.length;i++){
                int newElement=intArray[i];
                int j=i;
                for(;j>=gap && intArray[j-gap] > newElement;j-=gap){
                    intArray[j]=intArray[j-gap];
                }
                intArray[j]=newElement;
            }
        }
    }

    public static void shellInsertionReverse(int[] intArray){
        for(int gap= intArray.length/2;gap>0;gap/=2){
            for(int i= intArray.length-1-gap;i>=0;i--){
                int newElement=intArray[i];
                int j=i;
                for(;j<=intArray.length-1-gap && intArray[j+gap] > newElement;j+=gap){
                    intArray[j]=intArray[j+gap];
                }
                intArray[j]=newElement;
            }
        }
    }

    //add a method for shell sort for bubble sort
    public static void shellBubble(int[] intArray){
        //Preliminary work to partially sort the array to reduce swaps
        for(int gap = intArray.length/2;gap>1;gap/=2){
                for(int j=0;j<=intArray.length-1-gap;j+=gap){
                    if(intArray[j]>intArray[j+gap]) {
                        swap(intArray, j+gap, j);
                        print(intArray);
                }
            }
        }

        System.out.print("Before Final Pass array is  : ");
        print(intArray);

        //Final pass with gap=1 i.e bubble sort actual
        for(int i=intArray.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(intArray[j]>intArray[j+1]){
                    swap(intArray,j,j+1);
                }
            }
        }
    }

}

/* NOTES
* 1. Quadratic Algorithm, In-Place Algorithm and Unstable Algorithm
* 2. Time complexity depends on the gap but in worst case it will O(n^2)
* 3. It doesn't require as much as shifting in an insertion sort and same for bubble sort as well.
* 4. The advantage lise in the fact that arrays get partially sorted before the actual sort starts its work leading
*   to faster performance then the standard algorithm
* */