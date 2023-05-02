package Algorithms.Sort;

import static Helpers.Helper.print;

public class InsertionSort {
    public static void main(String[]args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

//        sortAscending(intArray);
//          sortDescending(intArray);
        rightToLeftSortAscending(intArray);
        print(intArray);
    }

    public static void sortAscending(int[] intArray){
        for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++){
            int newElement=intArray[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0 && intArray[i-1] > newElement;i--){
                intArray[i]=intArray[i-1];
            }
            intArray[i]=newElement;
        }
    }
    public static void sortDescending(int[] intArray){
        for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++){
            int newElement=intArray[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0 && intArray[i-1] < newElement;i--){
                intArray[i]=intArray[i-1];
            }
            intArray[i]=newElement;
        }
    }

    public static void rightToLeftSortAscending(int[] intArray){
        for(int lastUnsortedIndex = intArray.length-2;lastUnsortedIndex>=0;lastUnsortedIndex--){
            int newElement=intArray[lastUnsortedIndex];
            int i;
            for(i=lastUnsortedIndex; i< intArray.length -1 && intArray[i+1] < newElement;i++){
                intArray[i]=intArray[i+1];
            }
            intArray[i]=newElement;
        }
    }
}

/* NOTES
* 1. In Place Algorithm
* 2. Stable Algorithm because we are checking for > or < if element is equal then we don't take that as our new position
* 3. Quadratic Complexity
 */
