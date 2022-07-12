package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee implements TaxPayer {

    //properties
    String name;
    LocalDate localDate;

    //Accessor Methods
    public String getName() {
        return this.name;
    }

    public LocalDate getLocalDate() {
        return this.localDate;
    }

    public abstract String getEmployeeInfo();

    //Business Methods
    public String work() {
        String result = getName() + " worked";
        System.out.println(result);
       return  result;
    }

    public abstract double computeMonthlyCompensation();
}