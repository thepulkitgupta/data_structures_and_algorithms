package Helpers;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;

    private EmployeeNode tail;

    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        size++;
        if(head==null)
            tail=node;
        else{
            node.setNext(head);
            head.setPrev(node);
        }
        head=node;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        size++;
        if(tail==null)
            head=node;
        else{
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail=node;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while(current!=null){
            System.out.print(current);
            System.out.print(" <-> ");
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

        if(head.getNext()==null){
            tail=null;
        }
        else{
            head.getNext().setPrev(null);
        }

        head=head.getNext();

        size--;
        //optional step to remove the next reference of removed node
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if(isEmpty())
            return null;
        EmployeeNode removedNode = tail;

        if(tail.getPrev()==null){
            head=null;
        }
        else{
            tail.getPrev().setNext(null);
        }
        //op
        tail=tail.getPrev();
        size--;

        //optional
        removedNode.setPrev(null);
        return removedNode;
    }
}
