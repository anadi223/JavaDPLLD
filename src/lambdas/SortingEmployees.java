package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingEmployees {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 50000);
        Employee e2 = new Employee("Alice", 60000);
        Employee e3 =  new Employee("Bob", 45000);
        Employee e4 =  new Employee("Alice", 55000);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);


        employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
        employees.stream().forEach(System.out::println);


    }
}

class Employee{
    String name;
    int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
