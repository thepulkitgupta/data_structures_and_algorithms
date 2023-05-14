package Helpers;

public  class Helper {
    public static void print(int[] arr){
        System.out.print("[");
        for(int i =0;i<arr.length;i++){
            System.out.printf("%s ",arr[i]);
        }
        System.out.print("]\n");
    }

    public static void print(String[] arr){
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
