package Seminar6;

import java.util.Comparator;
import java.util.Objects;

public class Employee {

    int age;

    private String firstName;
    private String lastName;
    private double salary;
    private int rang;
    private int startYearWork;

    public Employee(int age, String firstName, String lastName, double salary, int rang, int startYearWork) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.rang = rang;
        this.startYearWork = startYearWork;
    }

    public Employee(int age, String firstName, String lastName, int rang, int startYearWork) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rang = rang;
        this.startYearWork = startYearWork;
        this.salary = 50.0;
    }

    String getFullName() {

        return firstName + " " + lastName;
    }

    public int getRang() {
        return rang;
    }

    public void setSalary(double salary) {
       if (salary > 0 && salary < 1000) this.salary = salary;
    }

    public double getSalary() {

        return salary > 0 ? salary: 0;
    }

    void upgrade(double salary) {

        setSalary(getSalary() + salary);

    }

    public int getAge() {
        return age;
    }

    boolean olderThan(Employee e){

    if (e.getAge() < getAge()) return true;
    else return false;


    }

    @Override
    public String toString() {

        return getFullName() + ", возраст: " + age + ", стаж работы с " + startYearWork + ", Ранг: " + rang + ", ЗП: " + getSalary() + "\n";

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {

            return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && age == employee.age && rang == employee.rang;
        } else return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, age, rang);

    }
}
