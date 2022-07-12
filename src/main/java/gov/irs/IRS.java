package gov.irs;

public class IRS {
    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0;

    public IRS() {
        this.taxPayers = taxPayers;
    }

    public void register(TaxPayer taxPayer) {
        taxPayers[currentIndex++] = taxPayer;
    }

    public double computeTotalMonthlyTaxToCollect() {
        double result = 0.0;

        for(int i = 0; i < currentIndex; i++) {
            result += taxPayers[i].computeMonthlyTaxPay();
        }

        return result;
    }

}