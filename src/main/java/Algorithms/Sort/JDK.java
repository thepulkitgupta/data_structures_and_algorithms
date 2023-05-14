package Algorithms.Sort;

import java.util.Arrays;

import static Helpers.Helper.print;

public class JDK {

    public static void main(String[]args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //first way to sort using the JDK is Arrays.sort();
        //This sort uses Dual Pivot Quick Sort which doesn't degrade like the Quick Sort
        Arrays.sort(intArray);

        print(intArray);

        int[] intArraySecond = {20, 35, -15, 7, 55, 1, -22};
        //second way of sorting available in the JDK is parallel sort
        //this is a hybrid of merge sort and quick sort ( when elements are less )
        //this also uses threads for any parallel tasks
        //This is also JDK dependent as per JDK 11 it uses sort-merge but in JDK-17 it uses parallel sort
        Arrays.parallelSort(intArraySecond);

    }
}
