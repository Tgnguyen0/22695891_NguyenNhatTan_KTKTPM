package org.example.state;

public class State_Main {
    public static void main(String[] args) {

        Order order = new Order();

        order.process(); // Mới tạo
        order.process(); // Đang xử lý
        order.process(); // Đã giao
    }
}
