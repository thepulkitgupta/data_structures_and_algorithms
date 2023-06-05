package DataStructures.HashTables;

import Helpers.Employee;

public class HashTables {

    public static void main(String [] args){

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("bill","end",78);

        SimpleHashTable hashTable = new SimpleHashTable();

        hashTable.put("Jones", janeJones);
        hashTable.put("Doe", johnDoe);
        hashTable.put("Wilson", mikeWilson);
        hashTable.put("Smith", marySmith);

//        hashTable.printHashTable();

        System.out.println("Retrieve key Wilson : " + hashTable.get("Wilson"));
    }

}
/* NOTES
1.
* */