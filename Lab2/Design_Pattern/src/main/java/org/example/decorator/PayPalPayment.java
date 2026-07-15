package org.example.decorator;

public class PayPalPayment implements Payment {

    @Override
    public double getCost() {
        return 1_000_000;
    }

    @Override
    public String getDescription() {
        return "Thanh toán bằng PayPal";
    }
}
