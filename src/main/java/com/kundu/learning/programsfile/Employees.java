package com.kundu.learning.programsfile;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Employees {

    @XmlElement(name = "employee")
    List<Employee> employees = null;

    public List<Employee> getEmployeeList() {
        return employees;
    }

    public void setEmployeeList(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employees=" + employees +
                '}';
    }
}
