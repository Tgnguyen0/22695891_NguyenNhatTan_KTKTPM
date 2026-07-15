package org.example.fatory;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Gửi EMAIL: " + message);
    }
}
