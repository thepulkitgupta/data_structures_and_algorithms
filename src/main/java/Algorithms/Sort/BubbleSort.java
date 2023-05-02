package Algorithms.Sort;

public class BubbleSort {

    public static void main(String[]args){

        int[] intArray = {20, 35, -15 , 7, 55, 1, -22};


        for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for(int i = 0; i<lastUnsortedIndex;i++){
                if(intArray[i]>intArray[i+1])
                    swap(intArray,i,i+1);
            }
        }

        print(intArray);

    }

    public static void print(int[] arr){
        System.out.print("[");
        for(int i =0;i<arr.length;i++){
            System.out.printf("%s ",arr[i]);
        }
        System.out.print("]\n");
    }

    public static void swap(int[]arr,int i, int j){
        if(i==j)
            //if the index is same then no need to swap
            return;
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

/* Notes
* 1. In-Place Algorithm : No new array dependent on N is created
* 2. Quadratic Complexity ( inner loop does less work but an approximation is still O(n^2)
* 3. As a result of quadratic complexity the algorithm degrades quickly
 */
