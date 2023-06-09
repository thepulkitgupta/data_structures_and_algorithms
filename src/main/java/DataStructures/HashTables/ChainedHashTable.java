package DataStructures.HashTables;

import Helpers.Employee;
import Helpers.StoredEmployee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    public LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable(){
        //once an object is created we will have an initial capacity of 10
        hashtable = new LinkedList[10];
        //initialize each array position with linked list
        for(int i =0;i<hashtable.length;i++){
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee value){
        int hashedKey= hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key,value));
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);

        Iterator<StoredEmployee> itr = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        while(itr.hasNext()){
            storedEmployee =  itr.next();
            if(storedEmployee.key.equals(key)){
                return storedEmployee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashedKey = hashKey(key);

        Iterator<StoredEmployee> itr = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int i =-1;
        while(itr.hasNext()){
            storedEmployee =  itr.next();
            i++;
            if(storedEmployee.key.equals(key)){
                break;
            }

        }

        if(storedEmployee == null || !storedEmployee.key.equals(key)){
            return null;
        }
        else {
            hashtable[hashedKey].remove(i);
            return storedEmployee.employee;

        }
    }

    public int hashKey(String key){
//        return key.length() % hashtable.length;
         return Math.abs(key.hashCode() % hashtable.length);
    }


    public void printHashTable(){
        for(int i =0;i<hashtable.length;i++){
            if(hashtable[i].isEmpty()){
                System.out.println("Position " + i + " : empty");
            }
            else {
                System.out.print("Position " + i + " : ");
                ListIterator<StoredEmployee> itr = hashtable[i].listIterator();
                while(itr.hasNext()){
                    System.out.print(itr.next().employee + " ->");
                }
                System.out.println("null");
            }
        }
    }

}

/* NOTES
1. The chaining is simpler but needs extra memory as well
2. On average linear probing is better than chaining
3. Worst Case retrieval would be linear time
4. We need a good hashing function to reduce collisions
5. Retrieval would O( 1 + k ) where k is average length of linked list
6. We can also use string hashcode method and mod it always by the length to get valid indices
* */