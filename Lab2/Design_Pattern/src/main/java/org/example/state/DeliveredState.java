package org.example.state;

public class DeliveredState implements OrderState {

    @Override
    public void handle(Order order) {
        System.out.println("Đơn hàng đã giao: Cập nhật trạng thái hoàn tất.");
    }
}
