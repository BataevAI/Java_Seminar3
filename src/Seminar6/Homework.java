package Seminar6;

import java.util.Set;
import java.util.TreeSet;
import Seminar6.Employee;

public class Homework {

    public static void main(String[] args) {


        EmployeeComparator comparator = new EmployeeComparator();
        Set<Employee> employees = new TreeSet<>(comparator);

        Employee e1 = new Employee(20, "John", "Snow", 60.0, 144, 2020);
        Employee e2 = new Employee(23, "Peter", "Parker", 80.0, 123, 2019);
        Employee e3 = new Employee(28, "Julian", "Anderson", 50.0, 89, 2012);
        Employee e4 = new Employee(40, "Endy", "Makdauwell", 78.0, 77, 2015);
        Employee e5 = new Employee(37, "Andrey", "Bataev", 1600.0, 1, 2010);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        System.out.println(e4.olderThan(e1));

        System.out.println(e1);
        e1.upgrade(30.0);
        System.out.println(e1);

        
    }
}
