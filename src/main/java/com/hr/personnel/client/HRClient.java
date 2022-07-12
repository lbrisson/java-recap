package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

class HRClient {
    public static void main(String[] args) {
        //Employee emp = new Employee("lance", LocalDate.of(2012, 03, 4));

        SalariedEmployee semp = new SalariedEmployee("wasb", LocalDate.of(1999, 3, 23), 4000.0);
        SalariedEmployee semp2 = new SalariedEmployee("bob", LocalDate.of(1999, 11, 18), 5000.0);

        HourlyEmployee hemp = new HourlyEmployee("mary", LocalDate.of(1599, 1, 3), 400, 23);


        //System.out.println(semp.getEmployeeInfo());
        System.out.println();
        //System.out.println(hemp.getEmployeeInfo());

        Department dep = new Department("Sony", "Miami");



        dep.addEmployee(semp);
        dep.addEmployee(hemp);
        dep.addEmployee(semp2);


        System.out.println( dep.getEmployeesSize());

        dep.getEmployeesInfo();

        System.out.println();

        int employeesWhoWorked = dep.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();

        System.out.println();
        System.out.println(employeesWhoWorked + " have worked");

        double totalComp = dep.computeDepartmentTotalMonthlyCompensation();
        System.out.println(totalComp);



    }
}