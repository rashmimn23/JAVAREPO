package com.kundu.learning.collections;

import java.util.*;

public class TutorialMap {

    public static void main(String[] args) {

    /*    Employee emp1=new Employee(1,"Rashmi","home");
        Employee emp2=new Employee(1,"Rashmi","home");

        emp2=emp1;

        boolean value= emp1.equals(emp2);
        System.out.println(value);*/

//HashMap
        Map<String, String> numberMap = new HashMap();
        numberMap.put("Name", "Rashmi");
        numberMap.put("Company", "Mphasis");
        numberMap.put("Role", "Project Manager");
        System.out.println(numberMap.put("Role", "Manager"));

        Map<String, String> numberMap1 = new HashMap();
        numberMap1.put("Name", "Rashmi");
        numberMap1.put("Company", "Mphasis");
        numberMap1.put("Role", "Project Manager");
        numberMap1.put("Role2", "Project Manager");

        System.out.println(numberMap);
        System.out.println(numberMap.keySet()); //retrieve only keys
        System.out.println(numberMap.values()); //retrieve only values

        //compare keys

        System.out.println(numberMap.keySet().equals(numberMap1.keySet()));
        System.out.println(numberMap.values().equals(numberMap1.values()));

        // compare values and ignore duplicates
        System.out.println(new HashSet(numberMap.values()).equals(new HashSet(numberMap1.values())));

        numberMap1.remove("Role2");
        System.out.println(new ArrayList(numberMap.values()).equals(new ArrayList(numberMap1.values())));

        //     System.out.println(numberMap.get("Name"));

        //print using iterator

        Iterator<String> i = numberMap.keySet().iterator();
        while (i.hasNext()) {

            String key = i.next();

            System.out.println(numberMap.get(key));
        }


        //print using entry iterator

        Iterator<Map.Entry<String, String>> iterator = numberMap1.entrySet().iterator();
        while (iterator.hasNext()) {

            Map.Entry<String, String> entry = iterator.next();

            System.out.println(entry.getKey() + "," + entry.getValue());
        }


// Role value will be replaced with Tech Lead
        numberMap.put("Role", "Tech Lead");

        Set<String> keys = numberMap.keySet();
        for(String key: keys){
            System.out.println(key + ' ' +numberMap.get(key));
        }

//HashTable
        Map <String, String> numberTable=new Hashtable();
        numberTable.put("Name", "Rashmi");
        numberTable.put("Company", "Mphasis");
        numberTable.put("Role", "Project Manager");

        System.out.println(numberTable );
    }
}
