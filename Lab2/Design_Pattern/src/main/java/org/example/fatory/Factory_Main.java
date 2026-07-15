package org.example.fatory;

public class Factory_Main {
    public static void main(String[] args) {

        Notification email = NotificationFactory.createNotification("email");
        email.send("Đơn hàng của bạn đã được xác nhận");

        Notification sms = NotificationFactory.createNotification("sms");
        sms.send("Mã OTP của bạn là 123456");

        Notification push = NotificationFactory.createNotification("push");
        push.send("Bạn có thông báo mới");
    }
}
