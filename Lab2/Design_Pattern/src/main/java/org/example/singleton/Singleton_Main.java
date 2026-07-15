package org.example.singleton;

public class Singleton_Main {
    public static void main(String[] args) {

        StoreConfig config1 = StoreConfig.getInstance();
        StoreConfig config2 = StoreConfig.getInstance();

        System.out.println("Tên cửa hàng: " + config1.getStoreName());
        System.out.println("Thuế mặc định: " + config2.getDefaultTax());
        System.out.println("Đơn vị tiền tệ: " + config1.getCurrency());

        // Kiểm tra Singleton
        System.out.println(config1 == config2); // true
    }
}
