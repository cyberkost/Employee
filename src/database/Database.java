package database;

import model.Employee;

import java.util.*;

public class Database {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee em1 = new Employee("Виктор Петров", 12, 22, "male", 0.5, 1000);
        Employee em2 = new Employee("Наталья Зайцева", 21, 20, "female", 2, 1500);
        Employee em3 = new Employee("Татьяна Сидорова", 13, 25, "female", 1.5, 2000);
        Employee em4 = new Employee("Джон Смит", 44, 30, "male", 5, 2400);
        Employee em5 = new Employee("Ник Конелли", 25, 29, "male", 4.5, 1700);
        Employee em6 = new Employee("Степан Степанов", 56, 23, "male", 3.5, 2100);

        employeeList.add(em1);
        employeeList.add(em2);
        employeeList.add(em3);
        employeeList.add(em4);
        employeeList.add(em5);
        employeeList.add(em6);

        Collections.sort(employeeList, new SortEmp());
        System.out.println(employeeList);
        System.out.println("****************************************");
        Collections.sort(employeeList, new SortEmp.NameComparator());
        System.out.println(employeeList);
        System.out.println("****************************************");
        Collections.sort(employeeList, new SortEmp.AgeComparator());
        System.out.println(employeeList);
        System.out.println("****************************************");
        Collections.sort(employeeList, new SortEmp.GenderComparator());
        System.out.println(employeeList);
        System.out.println("****************************************");
        Collections.sort(employeeList, new SortEmp.ExpComparator());
        System.out.println(employeeList);
        System.out.println("****************************************");
        Collections.sort(employeeList, new SortEmp.SalaryComparator());
        System.out.println(employeeList);

        System.out.println("TREESET-----------------------------------");

        Set<Employee> treeSet = new TreeSet<>();
        treeSet.add(em1);
        treeSet.add(em2);
        treeSet.add(em3);
        treeSet.add(em4);
        treeSet.add(em5);
        treeSet.add(em6);
        System.out.println(treeSet);
    }
}
