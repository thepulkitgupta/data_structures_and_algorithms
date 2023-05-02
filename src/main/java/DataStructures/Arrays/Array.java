package DataStructures.Arrays;

public class Array {

    public static void main(String []args) {

        int[] intArray = new int[5];

        intArray[0] = 22;
        intArray[1] = 3;
        intArray[2] = 7;
        intArray[3] = -10;
        intArray[4] = 22;


        //Finding an element in the array
        int index = -1;
        int key = 7;
        for (int i = 0; i < intArray.length; i++) {
                if(intArray[i]==key){
                    index=i;
                    break;
                }
        }
        System.out.println("Element " + key + " is found at index : " + index);
    }
}

/* Notes
 * ARRAY AS A DATA STRUCTURE
 * All elements of an array are stored in a contiguous block of memory
 * All elements in an array occupy the same space depending on the element type
 * As a result we can calculate the address of any index using the initialAddress + index * size of element
 * And as we know the address of any index we can retrieve that value instantly in a single step
 * 0 indices helps to reduce the formula of getting the address otherwise an addition subtraction of -1 would be needed
 * For an object array the object reference is stored and all references have same size
 * Retrieval of an element from an array when we know the index
 *   is of Constant Complexity i.e. algorithm doesn't degrade with inputs
 * In arrays if we have index then the complexity is O(1) Constant and if we need a loop then it's O(N) Linear.
*/
