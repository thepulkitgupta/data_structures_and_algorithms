package Algorithms.Search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20,35,55};

//        System.out.println(iterativeBinarySearch(intArray, -15));
//        System.out.println(iterativeBinarySearch(intArray, 35));
//        System.out.println(iterativeBinarySearch(intArray, 8888));
//        System.out.println(iterativeBinarySearch(intArray, 1));

        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 8888));
        System.out.println(recursiveBinarySearch(intArray, 1));

    }
    public static int iterativeBinarySearch(int[] input, int element){

        int start =0;
        int end = input.length;

        while(start< end){

            int mid = start + (end-start)/2 ;
            System.out.println("mid is " + mid);

            if(input[mid]==element)
                return mid;

            else if (input[mid] > element){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return -1;

    }

    public static int recursiveBinarySearch(int[]input, int element){
        return recursiveBinarySearch(input,  element,  0, input.length);
    }

    public static int recursiveBinarySearch(int input[], int element, int start, int end){

        if(start>=end)
            return -1;

        int mid = start + (end-start)/ 2;

        if(input[mid]==element)
            return mid;
        else if (input[mid] > element)
        {
            return recursiveBinarySearch(input, element, start, mid);
        }
        else{
            return recursiveBinarySearch(input, element, mid+1, end );
        }
    }
}

/* NOTES
* 1. Data must be sorted
* 2. Complexity is O(log(N))
* */