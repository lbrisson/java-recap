package com.hr.personnel;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class HourlyEmployeeTest {
    @Test
    public void computeMonthlyTaxPay() {
        HourlyEmployee lb = new HourlyEmployee("LB", LocalDate.of(2022, 1, 14), 400, 25);
        double monthlyTax = lb.computeMonthlyTaxPay();
        Assert.assertEquals(2500.0, monthlyTax, 0.01);
    }
}