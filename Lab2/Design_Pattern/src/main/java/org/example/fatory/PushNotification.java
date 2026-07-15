package org.example.fatory;

public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Gửi PUSH NOTIFICATION: " + message);
    }
}
