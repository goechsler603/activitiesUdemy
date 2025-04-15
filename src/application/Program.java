package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double manyDollars;

    System.out.println("Enter the current dollar price: ");
    CurrencyConverter.price = sc.nextDouble();
    System.out.println("Enter how many dollar s you want to buy: ");
    manyDollars = sc.nextDouble();
    System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.buyDollar(manyDollars));
    }
}
