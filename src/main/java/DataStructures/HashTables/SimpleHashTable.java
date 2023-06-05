package DataStructures.HashTables;

import Helpers.Employee;

public class SimpleHashTable {

    public Employee[] hashTable ;

    public SimpleHashTable(){
        //once an object is created we will have an initial capacity of 10
        hashTable = new Employee[10];
    }

    public int hashKey(String key){
        return key.length() % hashTable.length;
    }

    public void put(String key, Employee value) {
        int hashedKey = hashKey(key);
        if(hashTable[hashedKey]!=null){
            System.out.println("Employee already exists with hashed key :  " + hashedKey);
        }
        else {
            hashTable[hashedKey]=value;
        }
    }

    public Employee get(String key ){
        int hashedKey = hashKey(key);
        return hashTable[hashedKey];
    }

    public void printHashTable(){
        for(int i =0; i< hashTable.length; i++){
            System.out.println(hashTable[i]);
        }
    }

}
