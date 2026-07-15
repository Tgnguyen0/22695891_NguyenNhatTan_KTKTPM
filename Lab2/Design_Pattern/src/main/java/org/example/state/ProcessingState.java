package org.example.state;

public class ProcessingState implements OrderState {

    @Override
    public void handle(Order order) {
        System.out.println("Đơn hàng đang xử lý: Đóng gói và vận chuyển.");
        order.setState(new DeliveredState());
    }
}
