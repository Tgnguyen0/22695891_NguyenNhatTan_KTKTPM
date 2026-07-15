package org.example.strategy;

public class LuxuryTax implements TaxStrategy {

    @Override
    public double calculateTax(double price) {
        return price * 0.25; // Thuế xa xỉ 25%
    }
}
