package database;
import model.Employee;
import java.util.Comparator;
public class SortEmp implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.getId(), emp2.getId());
    }
    static class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.getName().compareTo(emp2.getName());
        }
    }
    static class AgeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return Integer.compare(emp1.getAge(), emp2.getAge());
        }
    }
    static class GenderComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.getGender().compareTo(emp2.getGender());
        }
    }
    static class ExpComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return Double.compare(emp1.getExperience(), emp2.getExperience());
        }
    }
    static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return Double.compare(emp1.getSalary(), emp2.getSalary());
        }
    }
}

