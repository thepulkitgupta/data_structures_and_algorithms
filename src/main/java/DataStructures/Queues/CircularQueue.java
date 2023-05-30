package DataStructures.Queues;

import Helpers.Employee;

import java.util.NoSuchElementException;

public class CircularQueue {

    private Employee[] queue;
    private int front ;
    private int back;

    public CircularQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee){
        //if size is equal to length only then update the size of the array
        if(size()==queue.length-1){
            int numOfItems=size();
            Employee[] newArray = new Employee[2*queue.length];
            //move the elements from the front to the queue.length();
            System.arraycopy(queue,front,newArray,0,queue.length-front);
            //move the elements from the 0th index to the back
            System.arraycopy(queue,0,newArray,queue.length-front,back);
            front=0;
            back=numOfItems;
            queue=newArray;
        }

        queue[back]=employee;
        //increment back normally if it's less than the queue.length-1
        if(back < queue.length-1){
            back++;
        }
        else {
            back=0;
        }
    }

    public Employee remove(){
        if(size()==0)
            throw new NoSuchElementException();
        Employee removedEmployee = queue[front];
        queue[front]=null;
        front++;
        //if front reaches the end of array then we need to wrap it to 0
        if(front==queue.length){
            front=0;
        }
        else if(size()==0){
            front=0;
            back=0;
        }
        return removedEmployee;
    }

    public Employee peek(){
        if(size()==0)
            throw new NoSuchElementException();
        return queue[front];
    }

    public int size(){
        if(front <= back){
            return back-front;
        }
        else{
           return  back - front + queue.length;
        }

    }

    public void printQueue(){
        if(front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        else{
            for(int i = front;i< queue.length;i++){
                System.out.println(queue[i]);
            }
            for(int i =0;i<back;i++){
                System.out.println(queue[i]);
            }
        }
    }

}
