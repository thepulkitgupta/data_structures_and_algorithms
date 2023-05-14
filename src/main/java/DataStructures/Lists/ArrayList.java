package DataStructures.Lists;

import Helpers.Employee;

import java.util.List;

public class ArrayList {
    public static void main(String[]args){

        List<Employee> employeeList = new java.util.ArrayList<>();
        employeeList.add(new Employee("Jane","Jones",123));
        employeeList.add(new Employee("John","Doe",4567));
        employeeList.add(new Employee("Mary","Smith",22));
        employeeList.add(new Employee("Mike","Wilson",3245));
//        employeeList.forEach(employee -> System.out.println(employee));

        //this is done in constant time, because arraylist is being backed by array
        System.out.println(employeeList.get(1));

        //check if list is empty
        System.out.println(employeeList.isEmpty());

        //set a new value to the employee
        employeeList.set(1,new Employee("John","Adams",4568));
//        employeeList.forEach(employee -> System.out.println(employee));

        //get size of the list
        System.out.println(employeeList.size());


        //add element at a particular index
        employeeList.add(3,new Employee("John","Doe",4567));
//        employeeList.forEach(employee -> System.out.println(employee));

        //get an array but we will get an object array
        Object[] employeeArray = employeeList.toArray();
        for(Object employee : employeeArray ){
//            System.out.println("Employee : " + employee);
        }
        //or
        Employee[] employeeNewArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : employeeNewArray ){
            System.out.println("Employee : " + employee);
        }

        //check for an instance ( this will give false if equals is not implemented )
        System.out.println(employeeList.contains(new Employee("Mary","Smith",22)));
        //check of index of an element ( this will also work only if the equals is implemented)
        System.out.println(employeeList.indexOf(new Employee("John","Doe",4567)));

        //remove an element from the employee
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));


    }
}

/* NOTES
* 1. ArrayList is good for random access and iterations over the array or list
* 2. ArrayList is backed by an array ( also called backing array )
* 3. Add element at an index and remove elements is not efficient as we need to copy and fill the gaps
* 4. As ArrayList is backed by an array it has the same problems as arrays
* 5. If we have the index then random access is in constant time otherwise it will be in linear time
* */
