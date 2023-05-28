package DataStructures.Stacks;

import Helpers.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class StackLinkedList {

    //normally we don't need doubly linked list for stack but memory is not an issue generally
    //use a singly linked list, array or some other class that implements deque
    private LinkedList<Employee> stack;

    public StackLinkedList(){
        stack= new LinkedList<>();
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        ListIterator<Employee> iterator = stack.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

// Note : We are doing this implementation rather than directly using linked list is so that we keep ourselves in check
// and provide clear rules on what we want to do in our stack class
}
