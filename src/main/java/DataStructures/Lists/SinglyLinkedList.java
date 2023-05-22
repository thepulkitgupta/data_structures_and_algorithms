package DataStructures.Lists;

import Helpers.Employee;
import Helpers.EmployeeSinglyLinkedList;

public class SinglyLinkedList {

    public static void main(String[]args) {
        Employee empl1 = new Employee("Jane", "Jones", 123);
        Employee empl2 = new Employee("John", "Doe", 4567);
        Employee empl3 = new Employee("Mary", "Smith", 22);
        Employee empl4 = new Employee("Mike", "Wilson", 3245);

        EmployeeSinglyLinkedList employeeSinglyLinkedList = new EmployeeSinglyLinkedList();

        System.out.println(employeeSinglyLinkedList.isEmpty());

        employeeSinglyLinkedList.addToFront(empl1);
        employeeSinglyLinkedList.addToFront(empl2);
        employeeSinglyLinkedList.addToFront(empl3);
        employeeSinglyLinkedList.addToFront(empl4);

        System.out.println(employeeSinglyLinkedList.getSize());

        employeeSinglyLinkedList.printList();

        employeeSinglyLinkedList.removeFromFront();
        System.out.println(employeeSinglyLinkedList.getSize());
        employeeSinglyLinkedList.printList();

    }
}


/* NOTES
This is a specific implementation of linked list because in general we would be using the JDK's linked list.
* 1. Good for the case when we are interested in adding and removing data at the front.
* 2. Not good for random access because then we have to traverse the array for the operations
* 3. Not good for cases where size is very tight because there is memory needed to store the reference as well.
* 4. If memory is not an issue and we need data that can grow then the linked list could be a good choice
* 5. There is no ONE SIZE FITS ALL solution.
* */