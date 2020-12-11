package com.kundu.learning.programsfile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {

    public static void main(String[] args) {

        try{
            File xmlFile = new File("C:\\Users\\rashmi.n\\Documents\\JavaProjects\\git\\files\\employee.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Employees employee = (Employees)unmarshaller.unmarshal(xmlFile);
            int count = employee.getEmployeeList().size();
            System.out.println(employee);
            System.out.println(count);
        }
        catch (JAXBException e){
            System.out.println(e.getMessage());
        }
    }
}
