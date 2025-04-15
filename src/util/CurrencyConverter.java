package util;

public class CurrencyConverter {
    public static double price;
    public static double iof = 1.06;

    public static double buyDollar(double manyDollars){
    return (manyDollars*price)*iof;
    }
}
