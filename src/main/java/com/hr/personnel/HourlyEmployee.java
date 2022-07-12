package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee  extends Employee implements TaxPayer {
    int hoursWorkedPerMonth;
    double hourlyRate;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate localDate, int hoursWorkedPerMonth, double hourlyRate) {
        setName(name);
        setLocalDate(localDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getHoursWorkedPerMonth() {
        return this.hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    @Override
    public String getEmployeeInfo() {
        String result = " name = " + super.getName() + " hire date = " + super.getLocalDate() + "  hours worked per month $" + getHoursWorkedPerMonth() + "  hourly rate = " + getHourlyRate();
        System.out.println(result);
        return result;
    }

    @Override
    public double computeMonthlyCompensation() {
        return getHoursWorkedPerMonth() * getHourlyRate();
    }

    @Override
    public double computeMonthlyTaxPay() {
        return computeMonthlyCompensation() * HOURLY_TAX_RATE;
    }
}