package DataStructures.Lists;

import Helpers.Employee;
import Helpers.EmployeeDoublyLinkedList;

public class DoublyLinkedList {

    public static void main(String[]args) {
        Employee empl1 = new Employee("Jane", "Jones", 123);
        Employee empl2 = new Employee("John", "Doe", 4567);
        Employee empl3 = new Employee("Mary", "Smith", 22);
        Employee empl4 = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList employeeDoublyLinkedList = new EmployeeDoublyLinkedList();

        System.out.println(employeeDoublyLinkedList.isEmpty());

        employeeDoublyLinkedList.addToFront(empl1);
        employeeDoublyLinkedList.addToFront(empl2);
        employeeDoublyLinkedList.addToFront(empl3);
        employeeDoublyLinkedList.addToFront(empl4);

        employeeDoublyLinkedList.printList();
        System.out.println(employeeDoublyLinkedList.getSize());

        Employee empl5 = new Employee("Bill", "Gogogo", 72);
        employeeDoublyLinkedList.addToEnd(empl5);
        employeeDoublyLinkedList.printList();
        System.out.println(employeeDoublyLinkedList.getSize());

        employeeDoublyLinkedList.removeFromFront();
        employeeDoublyLinkedList.printList();
        System.out.println(employeeDoublyLinkedList.getSize());

        employeeDoublyLinkedList.removeFromEnd();
        employeeDoublyLinkedList.printList();
        System.out.println(employeeDoublyLinkedList.getSize());

        //test out the addBefore method
        System.out.println(employeeDoublyLinkedList.addBefore(new Employee("James","Bond",007),empl3));
        employeeDoublyLinkedList.printList();

        System.out.println(employeeDoublyLinkedList.addBefore(new Employee("Pulkit","Bond",8),empl2));
        employeeDoublyLinkedList.printList();

        System.out.println(employeeDoublyLinkedList.addBefore(new Employee("Tikup","Bond",9),empl1));
        employeeDoublyLinkedList.printList();
    }
}


/* NOTES
This is a specific implementation of linked list because in general we would be using the JDK's linked list.
* 1. Good for the case when we are interested in adding and removing data at the front and end.
* 2. Not good for random access because then we have to traverse the array for the operations
* 3. Not good for cases where size is very tight because there is memory needed to store the reference as well.
* 4. If memory is not an issue and we need data that can grow then the linked list could be a good choice
* 5. There is no ONE SIZE FITS ALL solution.
* */