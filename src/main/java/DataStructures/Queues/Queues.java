package DataStructures.Queues;

import Helpers.Employee;

import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("bill","end",78);


//        CircularQueue queue = new CircularQueue(5);
//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.remove();
//        queue.add(marySmith);
//        queue.remove();
//        queue.add(mikeWilson);
//        queue.remove();
//        queue.add(billEnd);
//        queue.remove();
//        queue.add(janeJones);
//
//        queue.printQueue();

//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.add(marySmith);
//        queue.add(mikeWilson);
//        queue.add(billEnd);
////        queue.printQueue();
//
//        queue.remove();
//        queue.remove();
////        queue.printQueue();
//
////        System.out.println(queue.peek());
//////        queue.printQueue();
////
//        queue.remove();
//        queue.remove();
//        queue.remove();
////        queue.printQueue();
////
////        queue.remove();
//          queue.add(mikeWilson);
//          queue.printQueue();

        // should return true
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

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCase = string.toLowerCase();

        for(int i =0;i<lowerCase.length();i++){
            char ch = lowerCase.charAt(i);
            if(ch >= 'a'  && ch <= 'z' ){
                stack.push(ch);
                queue.add(ch);
            }
        }

        while(!stack.isEmpty()){
             if(!stack.pop().equals(queue.remove()))
                 return false;
        }

        return true;
    }
}

/*
* 1. Complexity of a queue implemented with array can be linear of constant depending
*  on whether we resize the array or not
* 2. Doubly Linked List is perfect for the queue, all operation are O(1)
* 3. Wrap the queue by using the doubly linked list method just like stacks
* */