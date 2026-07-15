package org.example.singleton;

public class StoreConfig {

    // Tạo instance duy nhất (tạo ngay khi class được load)
    private static final StoreConfig INSTANCE = new StoreConfig();

    //  Các thông tin cấu hình
    private String storeName;
    private double defaultTax;
    private String currency;

    // Constructor private → không cho new bên ngoài
    private StoreConfig() {
        // Giả lập đọc từ file / DB / env
        this.storeName = "My Online Shop";
        this.defaultTax = 0.1; // 10%
        this.currency = "VND";

        System.out.println("StoreConfig loaded!");
    }

    // Method truy cập instance
    public static StoreConfig getInstance() {
        return INSTANCE;
    }


    public String getStoreName() {
        return storeName;
    }

    public double getDefaultTax() {
        return defaultTax;
    }

    public String getCurrency() {
        return currency;
    }
}
