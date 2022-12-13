package database;

import model.Employee;

import java.util.HashMap;
import java.util.Map;

public class DatabaseHMap {
    public static void main(String[] args) {
        Map<Employee, Integer> employeeMap = new HashMap<>();
        Employee employee1 = new Employee("Виктор Петров", 12, 22, "male", 0.5, 1000);
        Employee employee2 = new Employee("Наталья Зайцева", 21, 20, "female", 2, 1500);
        Employee employee3 = new Employee("Татьяна Сидорова", 13, 25, "female", 1.5, 2000);
        employeeMap.put(employee1, 12);
        employeeMap.put(employee2, 21);
        employeeMap.put(employee3, 13);
        for (Employee i : employeeMap.keySet())
            System.out.println(i);
        System.out.println("---------------------------------------------------------------");
        employeeMap.remove(employee1, 12);
        for (Employee i : employeeMap.keySet())
            System.out.println(i);
    }
}
