package com.hr.personnel;


import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee implements TaxPayer {
    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate localDate, double monthlySalary) {
       setName(name);
       setLocalDate(localDate);
        this.monthlySalary = monthlySalary;
    }

    private void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String getEmployeeInfo() {
        String result =" name = " + super.getName() +  " hire date = " + super.getLocalDate() + " monthly salary $" + getMonthlySalary();
        System.out.println(result);
        return result;
    }

    @Override
    public double computeMonthlyCompensation() {
        return getMonthlySalary();
    }

    @Override
    public double computeMonthlyTaxPay() {
        return computeMonthlyCompensation() * SALARIED_TAX_RATE;
    }
}