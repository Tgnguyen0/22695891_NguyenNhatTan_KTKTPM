package org.example.state;

public class CancelledState implements OrderState {

    @Override
    public void handle(Order order) {
        System.out.println("Đơn hàng bị hủy: Hủy đơn hàng và hoàn tiền.");
    }
}
