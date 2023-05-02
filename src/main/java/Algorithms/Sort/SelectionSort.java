package Algorithms.Sort;

import static Helpers.Helper.print;
import static Helpers.Helper.swap;

public class SelectionSort {
    public static void main(String[]args){

            int[] intArray = {20, 35, -15 , 7, 55, 1, -22};

//        sortRightToLeftAscending(intArray);
//        sortRightToLeftDescending(intArray);
        sortLeftToRightDescending(intArray);
        print(intArray);
        }

    private static void sortRightToLeftAscending(int[] intArray) {
        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){

            int largest=0;
            for(int i=1;i<=lastUnsortedIndex;i++){
                if(intArray[i]> intArray[largest]){
                    largest=i;
                }
            }
            swap(intArray,largest,lastUnsortedIndex);
        }
    }
    private static void sortRightToLeftDescending(int[] intArray) {
        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){

            int smallest=0;
            for(int i=1;i<=lastUnsortedIndex;i++){
                if(intArray[i]< intArray[smallest]){
                    smallest=i;
                }
            }
            swap(intArray,smallest,lastUnsortedIndex);
        }
    }

    private static void sortLeftToRightDescending(int[] intArray) {
        for(int firstUnsortedIndex = 0; firstUnsortedIndex<intArray.length-1;firstUnsortedIndex++){
            int largest=intArray.length-1;
            for(int i= intArray.length -2;i>=firstUnsortedIndex;i--){
                if(intArray[i]>intArray[largest])
                   largest=i;
            }
            swap(intArray,largest,firstUnsortedIndex);
        }
    }
}

/* NOTES
* 1. In Place Algorithm
* 2. Unstable Algorithm
* 3. Needs lesser swaps then bubble sort in average case as in best case of bubble array could be sorted.
* 4. In every iteration we find the largest/smallest element and INSERT
*   it at the lastUnsortedIndex hence the name.
* 5. Quadratic Complexity
 */
