package DataStructures.HashTables;

import Helpers.Employee;
import Helpers.StoredEmployee;

public class SimpleHashTable {

    public StoredEmployee[] hashTable ;

    public SimpleHashTable(){
        //once an object is created we will have an initial capacity of 10
        hashTable = new StoredEmployee[10];
    }

    public int hashKey(String key){
        return key.length() % hashTable.length;
    }

    public void put(String key, Employee value) {
        int hashedKey = hashKey(key);

        //checking if the hashkey is occupied or not so that we can do linear probing
        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            //if the last index is being inspected and as we already know that it's occupied then wrap it.
            if(hashedKey==hashTable.length-1){
                hashedKey=0;
            }
            else {
                hashedKey++;
            }
            //traverse hashtable until empty slot is found or unitl we reach the same hashed key
            // and wrap if we reach end
            while(hashTable[hashedKey]!=null && hashedKey!=stopIndex){
                hashedKey= (hashedKey + 1) % hashTable.length;
            }
        }

        if(hashTable[hashedKey]!=null){
            System.out.println("Employee already exists with hashed key :  " + hashedKey);
        }
        else {
            hashTable[hashedKey]=new StoredEmployee(key,value);
        }
    }

    private boolean occupied(int hashedKey) {
        return hashTable[hashedKey]!=null;
    }

    public Employee get(String key ){
        int hashedKey = findKey(key);

        if(hashedKey==-1){
            //after traversing the whole hashtable we didn't find any data with the same key
            System.out.println("No such data found with key : " + key );
            return null;
        }

        return hashTable[hashedKey].employee;
    }

    public int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        //if the last index is being inspected and as we already know that it's occupied then wrap it.
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        //traverse hashtable until empty slot is found or until we reach the same hashed key or if any value is null
        // and wrap if we reach end
        while (hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(key) && hashedKey != stopIndex) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if(hashTable[hashedKey]!=null && hashTable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        else {
            return -1;
        }
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        Employee employee = hashTable[hashedKey].employee;
        ///null out the value
        hashTable[hashedKey]=null;

        //Re-Hashing
        StoredEmployee[] oldHashTable = hashTable;
        hashTable=new StoredEmployee[oldHashTable.length];
        for(int i =0;i<oldHashTable.length;i++){
            if(oldHashTable[i]!=null){
                put(oldHashTable[i].key,oldHashTable[i].employee);
            }
        }

        return employee;
    }

    public void printHashTable(){
        for(int i =0; i< hashTable.length; i++){
            if(hashTable[i]!=null){
                System.out.println("Position " + i + " : " + hashTable[i].employee);
            }
            else{
                System.out.println("Empty");
            }

        }
    }

}

/* NOTES
-1. A good hash function and load factor based resizing of an array can make hashtable peform very good.
0. Hashing is a way to convert the key to an index and store data based on that index for faster retrievals.
1. Linear Probing is a technique to handle the collisions, but it leads to Linear Time
2. No matter how good hashing function is there can be collisions
3. If load factor is high then chances are that we will be probing a lot
4. If load factor is reasonable by occasionally increasing size of array we can cut down on probes.
5. Removing an element which was probed to find the available slot causes the other value to be null as well
6. Rehashing is the process to create a new hashtable using the existing hashtable with new hashes calculated for each.
7. Rehashing at remove is better than not removing data and marking it as delete and doing probing to find and
put the data, also the data will be polluted and the load factor value won't get updated as size is not reducing
* */