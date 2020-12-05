
package hrapp;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private static int count = 0;
    private final static double MIN_SALARY = 100.0;

    public Employee(String name, double salary) {
        count++;
        this.id = count;
        setName(name);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary > MIN_SALARY ? salary : MIN_SALARY;
    }
    
    @Override
    public String toString() {
        return "Employee: " + getId() + " " + getName() + " " + getSalary();
    }
    
}
