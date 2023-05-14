package DataStructures.Lists;

import Helpers.Employee;

import java.util.List;

public class Vector {

    public static void main(String[]args) {

        List<Employee> employeeList = new java.util.Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
//        employeeList.forEach(employee -> System.out.println(employee));

        //this is done in constant time, because arraylist is being backed by array
        System.out.println(employeeList.get(1));

        //check if list is empty
        System.out.println(employeeList.isEmpty());
    }
}

/* NOTES
* 1. Vector is simply a synchronised array list, and it came before array list in 1.0
* 2. To avoid the overhead of synchronisation array list was introduced in 1.2
* 3. User vector if syncing needed otherwise go for arraylist
 */
