package gov.irs;

import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class IRSTest {
    @Test
    public void TaxToCollect_should_return_totalTax_from_all_employees() {
        HourlyEmployee lb = new HourlyEmployee("LB", LocalDate.of(2022, 1, 14), 400, 25);
        SalariedEmployee lb2 = new SalariedEmployee("LB2", LocalDate.of(2011, 12, 11), 400);
        IRS irs = new IRS();
        irs.register(lb);
        irs.register(lb2);


        double result = irs.computeTotalMonthlyTaxToCollect();
        Assert.assertEquals(2620.0,result , 0.01);
    }


}