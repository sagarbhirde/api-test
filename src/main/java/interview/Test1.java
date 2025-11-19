package interview;

import interview.entity.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Test1 {

    public static void main(String[] args) {

        List<interview.entity.Employee> employees = Arrays.asList(
                new Employee(101, "Alice", "IT", 90000, 32),
                new Employee(102, "Bob", "Finance", 85000, 28),
                new Employee(103, "Charlie", "IT", 95000, 40),
                new Employee(104, "David", "HR", 70000, 35),
                new Employee(105, "Eve", "Finance", 88000, 25)
        );
       Map<String,Long> count =  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
      Double avgAge = employees.stream().filter(e1 -> e1.getAge() > 30).
               collect(Collectors.averagingInt(Employee::getAge));
       System.out.println("Avg Age"+avgAge);

       count.forEach(((s, aLong) -> System.out.println(s + ":-"+aLong)));

        
    }
}
