package com.kundu.learning.collections;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList();

        Employee emp1 = new Employee(194878, "Rashmi", "IT", 180000);
        Employee emp2 = new Employee(194868, "Ravi", "Sales", 150000);
        Employee emp3 = new Employee(194811, "Kundu", "Admin", 100000);
        Employee emp4 = new Employee(194822, "Mudya", "HR", 130000);

        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);

        System.out.println("Employee List before sort");

        for (Employee e : emp) {
            System.out.println(e.getId() + "," + e.getName() + "," + e.getDepartment() + "," + e.getSalary());
        }

       Collections.sort(emp);

        System.out.println( '\n'+"Employee List after sort using comparable");
        for (Employee e : emp) {
            System.out.println(e.getId() + "," + e.getName() + "," + e.getDepartment() + "," + e.getSalary());
        }

        Collections.reverse(emp);

        System.out.println('\n'+"Employee List in descending order using comparable");
        for (Employee e : emp) {
            System.out.println(e.getId() + "," + e.getName() + "," + e.getDepartment() + "," + e.getSalary());
        }



        Collections.sort(emp,new SalaryComparator());

        System.out.println('\n'+"Employee List after sort using comparator in ascending order");
        for (Employee e : emp) {
            System.out.println(e.getId() + "," + e.getName() + "," + e.getDepartment() + "," + e.getSalary());
        }


        //Collections.sort(emp,new SalaryComparator().reversed());


        Collections.sort(emp,Collections.reverseOrder(new SalaryComparator()));

        System.out.println('\n'+"Employee List after sort using comparator in descending order" + '\n');
        for (Employee e : emp) {
            System.out.println(e.getId() + "," + e.getName() + "," + e.getDepartment() + "," + e.getSalary());
        }


    }
}
