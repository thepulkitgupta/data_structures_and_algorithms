package Helpers;

import Helpers.Employee;
import Helpers.EmployeeNode;

public class EmployeeSinglyLinkedList {

    private EmployeeNode head;

    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        size++;
        head=node;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while(current!=null){
            System.out.print(current);
            System.out.print(" -> ");
            current= current.getNext();
        }
        System.out.println(" null ");
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removedNode= head;
        head=head.getNext();
        size--;
        //optional step to remove the next reference of removed node
        removedNode.setNext(null);
        return removedNode;
    }
}
