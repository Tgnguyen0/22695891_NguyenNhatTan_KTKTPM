package org.example.fatory;

public class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Gửi SMS: " + message);
    }
}
