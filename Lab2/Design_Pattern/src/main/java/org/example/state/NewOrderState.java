package org.example.state;

public class NewOrderState implements OrderState {

    @Override
    public void handle(Order order) {
        System.out.println("Đơn hàng mới tạo: Kiểm tra thông tin đơn hàng.");
        order.setState(new ProcessingState());
    }
}
