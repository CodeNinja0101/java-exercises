package src.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class SecondHighestEmployeeSalary {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(20000));
        list.add(new Employee(40000));
        list.add(new Employee(10000));
        list.add(new Employee(50000));
        list.add(new Employee(30000));

        OptionalDouble secHighSal = list.stream()
                .mapToDouble(Employee::getSalary)
                .distinct()
                .sorted()
                .skip(Math.max(1, list.size() - 2))
                .limit(1)
                .findFirst();
        if (secHighSal.isPresent()) {
            System.out.println("Second Highest Salary: " + secHighSal.getAsDouble());
        } else {
            System.out.println("Second Highest Salary does not exist.");
        }
    }


}
