package org.example.decorator;

public class ProcessingFeeDecorator extends PaymentDecorator {

    public ProcessingFeeDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public double getCost() {
        return payment.getCost() + 50_000; // phí xử lý
    }

    @Override
    public String getDescription() {
        return payment.getDescription() + " + Phí xử lý";
    }
}

