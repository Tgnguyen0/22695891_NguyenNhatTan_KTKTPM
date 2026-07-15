package org.example.state;

public class Order {

    private OrderState state;

    public Order() {
        this.state = new NewOrderState(); // trạng thái ban đầu
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }
}

