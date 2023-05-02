package Algorithms.Sort;

import static Helpers.Helper.print;
import static Helpers.Helper.swap;

public class BubbleSort {

    public static void main(String[]args){

        int[] intArray = {20, 35, -15 , 7, 55, 1, -22};

//        bubbleAscending(intArray);
//        bubbleDescending(intArray);
        sortAscendingFromLeftSide(intArray);
        print(intArray);
  }

  public static void sortAscendingFromLeftSide(int[]intArray){
        for(int firstUnsortedIndex=0;firstUnsortedIndex<intArray.length;firstUnsortedIndex++){
            for(int i= intArray.length-1;i>firstUnsortedIndex;i--) {
                if(intArray[i]<intArray[i-1]){
                    swap(intArray,i,i-1);
                }
            }
        }
  }

    public static void bubbleAscending(int[]intArray){
        //sort ascending
        for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for(int i = 0; i<lastUnsortedIndex;i++){
                if(intArray[i]>intArray[i+1])
                    swap(intArray,i,i+1);
            }
        }
    }

    public static void bubbleDescending(int[]intArray){
        //sort descending
        for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for(int i = 0; i<lastUnsortedIndex;i++){
                if(intArray[i]<intArray[i+1])
                    swap(intArray,i,i+1);
            }
        }
    }

}

/* Notes
* 1. In-Place Algorithm : No new array dependent on N is created
* 2. Quadratic Complexity ( inner loop does less work but an approximation is still O(n^2)
* 3. As a result of quadratic complexity the algorithm degrades quickly
* 4. In every iteration we BUBBLE the number to the end of the array hence the name
* 5. It's also a Stable Sort because we don't change the order of the duplicates ( i<i+-1 condition )
 */
