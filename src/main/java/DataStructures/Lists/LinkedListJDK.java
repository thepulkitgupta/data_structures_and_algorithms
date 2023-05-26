package DataStructures.Lists;

import Helpers.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListJDK {

    public static void main(String[] args){

        Employee empl1 = new Employee("Jane", "Jones", 123);
        Employee empl2 = new Employee("John", "Doe", 4567);
        Employee empl3 = new Employee("Mary", "Smith", 22);
        Employee empl4 = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill","End",78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(empl1);
        list.addFirst(empl2);
        list.addFirst(empl3);
        list.addFirst(empl4);

        list.addLast(billEnd);
        printList(list);

        list.removeFirst();
        printList(list);

        list.removeLast();
        printList(list);

        list.remove();
        printList(list);
    }

    private static void printList(LinkedList<Employee> list) {
        Iterator iter = list.iterator();
        System.out.print("\nHEAD -> ");
        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.print("null");
    }
}

/* NOTES
* 1. Use when memory not an issue.
* 2. We can also create a singly linked list if we don't want the extra memory overhead.
* 3. Circular LInked List also exist where end points to head and we can print the whole list starting from anywhere
* */