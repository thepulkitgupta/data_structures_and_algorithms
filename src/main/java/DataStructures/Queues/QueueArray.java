package DataStructures.Queues;

import Helpers.Employee;

import java.util.NoSuchElementException;

public class QueueArray {

    private Employee[] queue;
    private int front ;
    private int back;

    public QueueArray(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee){
        //increase the size if the array is full.
        if(back==queue.length){
            Employee[] newArray = new Employee[2*queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue=newArray;
        }

        queue[back]=employee;
        back++;
    }

    public void remove(){
        if(size()==0)
            throw new NoSuchElementException();
        Employee removedEmployee = queue[front];
        queue[front]=null;
        front++;
        if(size()==0){
            front=0;
            back=0;
        }
    }

    public Employee peek(){
        if(size()==0)
            throw new NoSuchElementException();
        return queue[front];
    }

    public int size(){
        return back - front;
    }

    public void printQueue(){
        for(int i =front ; i<back;i++){
            System.out.println(queue[i]);
        }
    }

}
