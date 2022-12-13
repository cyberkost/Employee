package model;

import com.github.javafaker.Name;

// Сделать проект для Сотрудников компании.
// Должен быть класс Сотрудники, ЭНАМЫ с градацией должностей.
// Интерфейсы с фичами для каждого уровня должности.
// Наследники от главного класса будут ТОПы, Среднего звена, Рядовые сотрудники.
// Хранить сотрудников в папке model. Далее сделать класс базаДанных по аналогии с уроком.
// Хранить класс в папке bd. Сделать класс Сервис, который будет выполнять разного рода опреации, анпрмер смены должности итд.
// Хранить Сервисы в папке service
public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private int age;
    private String gender;
    private double experience;
    private double salary;
    public Employee(String name, int id, int age, String gender, double experience, double salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.experience = experience;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getExperience() {
        return experience;
    }
    public void setExperience(double experience) {
        this.experience = experience;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }
    //@Override
    //public int compareTo(Employee anotherEmp) {
    //    if (this.id == anotherEmp.id) {
    //    return 0;
    //    } else if (this.id < anotherEmp.id) {
    //        return - 1;
    //    } else
    //        return 1;
    //}
    @Override
    public int compareTo(Employee anotherEmp) {
        return this.id - anotherEmp.id;
    }
}

