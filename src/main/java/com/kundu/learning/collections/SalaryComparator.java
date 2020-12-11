package com.kundu.learning.collections;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        //return o1.getSalary().compareTo(o2.getSalary()) ;

        return o1.getSalary().compareTo(o2.getSalary()) ;



/*        if(o1.getSalary()<o2.getSalary()) {
            return 1;
        }
        if (o1.getSalary()>o2.getSalary()) {
            return -1;
        }
        else{return 0;}*/
    }
}
