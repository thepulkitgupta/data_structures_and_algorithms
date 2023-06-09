package DataStructures.HashTables;

import Helpers.Employee;

import java.util.HashMap;
import java.util.Map;

public class HashMapJDK {



    public static void main(String []args){
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill","End",78);
        Employee donJohnson = new Employee("Don", "Johnson", 69);

        Map<String, Employee> hashMap = new HashMap<>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("End", billEnd);
//        Employee employee = hashMap.put("End", mikeWilson);
        Employee employee = hashMap.putIfAbsent("End", mikeWilson);
        System.out.println(employee);

        System.out.println(hashMap.get("End"));
        System.out.println(hashMap.getOrDefault("someone", marySmith));

        System.out.println(hashMap.remove("Doe"));

//        System.out.println(hashMap.containsKey("End"));
//        System.out.println(hashMap.containsValue(johnDoe));

        //print using iterator
//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //print using forEach only available after Java 8
        hashMap.forEach((K,v)->System.out.println("Key : " + K + ", Value(Employee) : " + v));
    }

}
