package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        CurrencyConverter converter = requestData(scanner);
        double result = converter.calculaTotal();

        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        scanner.close();
    }

    public static CurrencyConverter requestData(Scanner scanner){
        System.out.print("What is the dollar price? ");
        double dollarQuotation = scanner.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantityDollar = scanner.nextDouble();
        return new CurrencyConverter(dollarQuotation, quantityDollar);
    }
}
