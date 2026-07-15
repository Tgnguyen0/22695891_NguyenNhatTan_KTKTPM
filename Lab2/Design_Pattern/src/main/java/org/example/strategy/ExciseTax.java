package org.example.strategy;

public class ExciseTax implements TaxStrategy {

    @Override
    public double calculateTax(double price) {
        return price * 0.15; // Thuế tiêu thụ 15%
    }
}
