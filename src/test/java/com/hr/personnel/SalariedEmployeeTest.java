package com.hr.personnel;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class SalariedEmployeeTest {

    @Test
    public void computeMonthlyTaxPay() {
        SalariedEmployee lb = new SalariedEmployee("LB", LocalDate.of(2022, 1, 14), 1000.0);
        double monthlyTax = lb.computeMonthlyTaxPay();
        Assert.assertEquals(300.0, monthlyTax, 0.01);
    }
}