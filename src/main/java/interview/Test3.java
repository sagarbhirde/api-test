package interview;

import interview.entity.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String[] args) {
        // List of employees - Each of employee having id, name, salary, dept
        // using collection fetch the highest salary from each dept

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", "IT", 90000, 32),
                new Employee(102, "Bob", "Finance", 85000, 28),
                new Employee(103, "Charlie", "IT", 95000, 40),
                new Employee(104, "David", "HR", 70000, 35),
                new Employee(105, "Eve", "Finance", 88000, 25)
        );

        Map<String, Optional<Employee>> highestSalary=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        highestSalary.forEach((department,employee) -> System.out.println("Dept:-"+ department + "-" + "EMP" + employee.get().getSalary()));

    }
}
