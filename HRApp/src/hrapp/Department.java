
package hrapp;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Department {
    private String name;
    private static final int CAPACITY = 10;
    private final ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    public void addEmployee (Employee e) {
        if (! this.employees.contains(e)) {
            if (this.employees.size() < CAPACITY) this.employees.add(e);
        }
    }
    
    public int countEmployees (Department d) {
        return d.employees.size();
    }
    
    public Employee findEmployeeById(int id) {
        Stream<Employee> employees = this.getEmployees().stream();
        return employees.filter(e -> id == e.getId()).findFirst().orElse(null);
    }
    
    public double sumSalary() {
        double total = .0;
        for (Employee e : this.getEmployees()) {
            total += e.getSalary();
        }
        return total;
    }
    
    public double averageSalary() {
        return this.getEmployees().size() > 0
                ? this.sumSalary() / this.getEmployees().size()
                : 0;
    }

    @Override
    public String toString() {
        return "Department: " + name;
    }
    
}
