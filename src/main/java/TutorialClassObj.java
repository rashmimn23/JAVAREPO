class Employee{
    String name;
    int id;
    String role;

    void result(){

        System.out.println("Employee " + name + " with ID " + id+ " is working as "+role);
    }
}

public class TutorialClassObj {

    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.name="Ravindra";
        emp1.id=194868;
        emp1.role="Senior System Engineer";

        Employee emp2=new Employee();

        emp2.name="Rashmi";
        emp2.id=194878;
        emp2.role="Project Lead";

       System.out.println("Employee " + emp1.name + " with ID " + emp1.id+ " is working as "+emp1.role);
        //System.out.println("Employee " + emp2.name + " with ID " + emp2.id+ " is working as "+emp2.role);

        emp1.result();
        emp2.result();
    }
}
