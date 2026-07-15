package org.example.decorator;

public class DiscountDecorator extends PaymentDecorator {

    public DiscountDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public double getCost() {
        return payment.getCost() - 100_000; // giảm giá
    }

    @Override
    public String getDescription() {
        return payment.getDescription() + " + Mã giảm giá";
    }
}
