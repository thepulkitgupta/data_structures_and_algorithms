package DataStructures.Stacks;

import Helpers.Employee;

import java.util.LinkedList;
import java.util.Stack;

public class Stacks {
    public static void main(String[]args){
//            StackArray stack= new StackArray(10);
//            StackLinkedList stack= new StackLinkedList();
            //not recommended because deque interface implements LIFO better
            Stack<Employee> stack = new Stack<>();
            stack.push(new Employee("jane","jones",123));
            stack.push(new Employee("john","doe",4567));
            stack.push(new Employee("mary","smit",22));
            stack.push(new Employee("mike","wilson",56));
            stack.push(new Employee("bill","end",78));

//            stack.printStack();

//            System.out.println(stack.peek());
//            stack.printStack();

//            System.out.println("Popped : " + stack.pop());
//            System.out.println(stack.peek());

//check for palindrome test
            System.out.println(checkForPalindrome("abccba"));
            // should return true
            System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
            // should return true
            System.out.println(checkForPalindrome("I did, did I?"));
            // should return false
            System.out.println(checkForPalindrome("hello"));
            // should return true
            System.out.println(checkForPalindrome("Don't nod"));

    }

    private static boolean checkForPalindrome(String string) {

        //create a stack using linked list
        LinkedList<Character> stack = new LinkedList<>();
        //create a string of size of input string and store characters in it while adding to stack
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        //convert the string to lowercase or uppercase so that we only have to write one condition of character range
        String lowerCase = string.toLowerCase();
        //loop through the input string and check if each character belongs in the a-z range
        //if it does then add it to the string and to the stack
        for(int i =0;i<lowerCase.length();i++){
            char c = lowerCase.charAt(i);
            if(c >='a' && c <='z'){
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while(!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPunctuation.toString());
    }


}

/* NOTES
* 1. Stacks only work with the first item
* 2. Arrays have good random access and we need initialise size of array
* 3. Ideal data structure is Linked List because all operations can be done in O(1)
* 4. Stacks are abstract data structures and can be implemented by any other data structure
* 5. As per JAVA docs deque interface provides the complete operation set of LIFO, so we should any implementation of
* deque, and as we know a linked list is idea, so LinkedList.class is best because it implements deque as well.
* */