package util;

public class CurrencyConverter {
    private double dollarQuotation;
    private double quantityDollar;
    public static final double IOF = 0.06;

    public double getDollarQuotation() {
        return dollarQuotation;
    }

    public double getQuantityDollar() {
        return quantityDollar;
    }

    public CurrencyConverter() {}

    public CurrencyConverter(double dollarQuotation, double quantityDollar) {
        this.dollarQuotation = dollarQuotation;
        this.quantityDollar = quantityDollar;
    }

    public double calculaTotal() {
        double valor = dollarQuotation * quantityDollar;
        double taxa = valor * IOF;
        return valor + taxa;
    }

}
