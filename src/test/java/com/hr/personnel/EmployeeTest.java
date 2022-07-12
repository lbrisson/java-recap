package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee emp;
    private Employee emp2;
    private Department dep;

    @Before
    public void setUp() throws Exception {
        //emp = new Employee("kane", LocalDate.of(2019, 1, 23));
        //emp2 = new Employee("bob", LocalDate.of(2018, 12, 3));
        dep = new Department("Sony", "Miami");
    }

    @Test
    public void work_should_return_name_worked_string() {
        String work = emp.work();
        Assert.assertEquals("kane worked", work);
    }


    @Test
    public void getEmployeeInfo_should_return_name_and_hireDate() {
        String empInfo = emp.getEmployeeInfo();
        Assert.assertEquals("name = kane hire date = 2019-01-23", empInfo);
    }

    @Test
    public void addEmployee_should_add_employee_to_dep_employeeArray() {
        dep.addEmployee(emp);
        dep.addEmployee(emp2);
        Assert.assertEquals(2, dep.getEmployeesSize());
    }

    @Test
    public void returnNumOfEmplsWhoWorked_should_return_total_number_ofEmployees_Who_Worked() {
        dep.addEmployee(emp);
        dep.addEmployee(emp2);
        dep.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();


        Assert.assertEquals(2, dep.getEmployeesSize());
    }


}