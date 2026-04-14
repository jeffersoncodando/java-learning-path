package arrays.currency.entities;

public class CurrencyConverter {
    public static double iofRate = 0.06;

    public static double dollarToReal(double dollarPrice, double dollarAmount){
        return dollarAmount * dollarPrice * (1.0 + iofRate);
    }
}
