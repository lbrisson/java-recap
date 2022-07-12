package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

public class Department {
    private String name;
    private String location;
    private Collection<Employee> employees = new ArrayList<>(100);
    private Employee[] employees2 = new Employee[100];
    private int currentIndex;

    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    private void setLocation(String location) {
    }

    private void setName(String name) {
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
        employees2[currentIndex++] = emp;
    }

    public int getEmployeesSize() {
        return employees.size();
    }

    public void getEmployeesInfo() {
        employees.forEach(Employee::getEmployeeInfo);
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int empWhoWorked = 0;

        employees.forEach(Employee::work);
        int result = employees.size();

        return result;
    }

    public double computeDepartmentTotalMonthlyCompensation() {
        double departmentTotalMonthlyCompensation = 0.0;

        for(int i = 0; i < currentIndex; i++) {
            //System.out.println("employee class = " + employees2[i].getClass());
            double monthlyCompensation = employees2[i].computeMonthlyCompensation();
            departmentTotalMonthlyCompensation += monthlyCompensation;
        }
        return departmentTotalMonthlyCompensation;
    }

    public Employee[] getEmployees() {
        return employees2;
    }

}