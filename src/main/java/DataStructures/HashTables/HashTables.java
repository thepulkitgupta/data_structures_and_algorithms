package DataStructures.HashTables;

import Helpers.Employee;

public class HashTables {

    public static void main(String [] args){

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill","End",78);
        Employee donJohnson = new Employee("Don", "Johnson", 69);

//        SimpleHashTable hashTable = new SimpleHashTable();
        ChainedHashTable hashTable = new ChainedHashTable();

        hashTable.put("Jones", janeJones);
        hashTable.put("Doe", johnDoe);
        hashTable.put("Wilson", mikeWilson);
        hashTable.put("Johnson", donJohnson);
        hashTable.put("Smith", marySmith);

        hashTable.printHashTable();

//        System.out.println("Retrieve key Wilson : " + hashTable.get("Wilson"));
//
//        //this call will fail until we handle the get method to accommodate for linear probing
//        System.out.println("Retrieve key Smith : " + hashTable.get("Smith"));
//
//        hashTable.remove("Wilson");
//        hashTable.remove("Jones");
//
//        hashTable.printHashTable();
//
//        System.out.println("Retrieve key Smith : " + hashTable.get("Smith"));



    }

}
