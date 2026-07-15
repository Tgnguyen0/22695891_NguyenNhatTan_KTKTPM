package org.example.decorator;

public class Decorate_Main {
    public static void main(String[] args) {

        // Thanh toán thẻ tín dụng + phí xử lý
        Payment payment1 = new ProcessingFeeDecorator(
                new CreditCardPayment()
        );

        System.out.println(payment1.getDescription());
        System.out.println("Tổng tiền: " + payment1.getCost());

        System.out.println();

        // PayPal + phí xử lý + mã giảm giá
        Payment payment2 = new DiscountDecorator(
                new ProcessingFeeDecorator(
                        new PayPalPayment()
                )
        );

        System.out.println(payment2.getDescription());
        System.out.println("Tổng tiền: " + payment2.getCost());
    }
}
