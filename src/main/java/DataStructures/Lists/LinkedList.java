package DataStructures.Lists;

import Helpers.Employee;
import Helpers.EmployeeLinkedList;

public class LinkedList {

    public static void main(String[]args) {
        Employee empl1 = new Employee("Jane", "Jones", 123);
        Employee empl2 = new Employee("John", "Doe", 4567);
        Employee empl3 = new Employee("Mary", "Smith", 22);
        Employee empl4 = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        System.out.println(employeeLinkedList.isEmpty());

        employeeLinkedList.addToFront(empl1);
        employeeLinkedList.addToFront(empl2);
        employeeLinkedList.addToFront(empl3);
        employeeLinkedList.addToFront(empl4);

        System.out.println(employeeLinkedList.getSize());

        employeeLinkedList.printList();

        employeeLinkedList.removeFromFront();
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.printList();

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