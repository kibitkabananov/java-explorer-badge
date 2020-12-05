package hrapp;

import java.util.HashMap;
import java.util.Map;

public class HRApp {

    public static void main(String[] args) {
        
        System.out.println("HR Application is starting.");
        
        Department it = new Department("IT");
        System.out.println(it);
        
        Employee[] staff = {
            /*
            new Employee("ann",50.1),
            new Employee("ben",110.2),
            new Employee("clara",120.3),
            new Employee("den",130.4),
            new Employee("elen",140.5),
            new Employee("frank",150.6),
            new Employee("greg",160.7),
            new Employee("hanna",170.8),
            new Employee("iren",180.9),
            new Employee("joe",190.0),
            new Employee("kostas",200.1),
            new Employee("len",210.2),
            new Employee("moe",220.3),
*/
        };
        
        for (Employee e : staff) {
            it.addEmployee(e);
        }
        
        System.out.println("ID 7: " + it.findEmployeeById(7));
        //System.out.println("ID 100: " + it.findEmployeeById(100));
        
        System.out.println("Employees of " + it.getName() + ":");
        for (Employee e : it.getEmployees()){
            System.out.println(e);
        }
        
        System.out.println(it.countEmployees(it));
        
        System.out.println("The total salary of " + it.getName() +
                " is: " + it.sumSalary());
        
        System.out.println("The avg salary within " + it.getName() +
                " is: " + it.averageSalary());
        
        
        
    }
    
}
