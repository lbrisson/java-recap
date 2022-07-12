package com.hr.personnel;

import gov.irs.TaxPayer;

public class Corporation implements TaxPayer {
    private String name;
    private double monthlyIncome;

    public Corporation(String name, double monthlyIncome) {
        this.name = name;
        this.monthlyIncome = monthlyIncome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getName() {
        return this.name;
    }

    private double getMonthlyIncome() {
        return this.monthlyIncome;
    }


    @Override
    public double computeMonthlyTaxPay() {
        return getMonthlyIncome() * CORP_TAX_RATE;
    }
}