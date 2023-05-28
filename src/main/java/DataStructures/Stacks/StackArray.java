package DataStructures.Stacks;

import Helpers.Employee;

import java.util.EmptyStackException;

public class StackArray {

    private Employee[] stack;

    //top always holds the first available position
    private int top;

    public StackArray(int capacity){
        stack= new Employee[capacity];
    }

    //if we know the data set size then it's good because to use array because then push can be done in O(1)
    public void push(Employee employee){
        //check if stack is full
        if(top==stack.length){
            // need to resize the backing array
            //double the length rather than icreasing my one
            Employee[] newArray=new Employee[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack=newArray;
        }
        stack[top++]=employee;
    }

    public Employee pop(){
        if(isEmpty())
            throw new EmptyStackException();
        //pre -- is used so that we can return the top element, as top points to first available index
        Employee employee=stack[--top];
        //now once we have return the value the top is reduced but the data is still there
        stack[top]=null;
        return employee;

        //optional : we can do a check the top value against the length to reduce the unused array but it will be O(n)
    }

    public Employee peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return stack[top-1];
    }

    public int size(){
        return top;
    }

    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty(){
        return top==0;
    }
}
