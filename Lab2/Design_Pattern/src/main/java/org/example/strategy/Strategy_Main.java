package org.example.strategy;

public class Strategy_Main {
    public static void main(String[] args) {

        Product phone = new Product("Điện thoại", 10_000_000, new VATTax());
        Product alcohol = new Product("Rượu", 5_000_000, new ExciseTax());
        Product luxuryWatch = new Product("Đồng hồ xa xỉ", 50_000_000, new LuxuryTax());

        System.out.println("Thuế điện thoại: " + phone.calculateTax());
        System.out.println("Giá sau thuế: " + phone.getTotalPrice());

        System.out.println("Thuế rượu: " + alcohol.calculateTax());
        System.out.println("Giá sau thuế: " + alcohol.getTotalPrice());

        System.out.println("Thuế đồng hồ xa xỉ: " + luxuryWatch.calculateTax());
        System.out.println("Giá sau thuế: " + luxuryWatch.getTotalPrice());
    }
}
