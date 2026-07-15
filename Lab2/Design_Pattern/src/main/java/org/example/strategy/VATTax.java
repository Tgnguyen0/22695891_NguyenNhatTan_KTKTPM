package org.example.strategy;

public class VATTax implements TaxStrategy {

    @Override
    public double calculateTax(double price) {
        return price * 0.10; // VAT 10%
    }
}
