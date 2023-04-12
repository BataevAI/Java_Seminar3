package Seminar6;

import java.util.Comparator;


    public  class EmployeeComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee firstEmployee, Employee secondEmployee) {
            return Integer.compare(firstEmployee.getRang() - secondEmployee.getRang(), 0);
        }
    }


