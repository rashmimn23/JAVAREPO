package com.kundu.learning.collections;

import java.util.*;

public class TutorialSet {

    public static void main(String args[]) {

        Set<Integer> numberSet = new HashSet();

        numberSet.add(78);
        System.out.println(numberSet.add(56));
        numberSet.add(98);

// Duplicate 56 will not be inserted
        System.out.println(numberSet.add(56));

        //  numberSet.forEach(System.out::println);

        Iterator<Integer> i = numberSet.iterator();

        while (i.hasNext()) {
            Integer value = i.next();
            System.out.println(value);
        }

        numberSet.remove(98);

        System.out.println(numberSet);

//TreeSet
        Set<Integer> numberTreeSet = new TreeSet();

        numberTreeSet.add(78);
        numberTreeSet.add(98);
        numberTreeSet.add(56);

        System.out.println("TreeSet Prints values in ascending order");
      //  numberTreeSet.forEach(System.out::println);


        // Linkedset

        Employee employee1 = new Employee(194878, "Rashmi", "Home",12345);
        Employee employee2 = new Employee(194868, "Ravi", "Office",23456);
        Employee employee3 = new Employee(194878, "Rashmi", "Home",98765);

        Set<Employee> employeeSet = new LinkedHashSet();

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);

       for(Employee e:employeeSet){
           System.out.println(e.getId()+","+e.getName()+","+e.getDepartment() );
       }

        Set<String> linkedSet = new LinkedHashSet();
        linkedSet.add("Rashmi");
        linkedSet.add("Ravi");
        linkedSet.add("Rashmi");

        Iterator<String> j = linkedSet.iterator();

        while (j.hasNext()) {
            String str = j.next();
            System.out.println(str);

        }
    }
}
