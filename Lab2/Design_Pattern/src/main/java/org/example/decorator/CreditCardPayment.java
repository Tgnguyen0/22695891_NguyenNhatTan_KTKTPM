package org.example.decorator;

public class CreditCardPayment implements Payment {

    @Override
    public double getCost() {
        return 1_000_000;
    }

    @Override
    public String getDescription() {
        return "Thanh toán bằng Thẻ tín dụng";
    }
}
