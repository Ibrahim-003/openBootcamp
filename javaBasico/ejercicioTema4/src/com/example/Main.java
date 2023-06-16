package com.example;

public class Main {
    public static void main(String[] args) {

        // objeto smartPhone
        SmartDevice smartPhone = new SmartPhone("Smart Phone",
                "Apple", 1500.00, "OLED", "iOS", 64);
        System.out.println(smartPhone);
        System.out.println(smartPhone.getPrecio());

        // objeto smartWathc
        SmartDevice smartWatch = new SmartWatch("Smart Watch",
                "Apple", 500.00, "AMOLED", "watchOS", new String[]{"Bluetooth", "WiFi"});
        System.out.println(smartWatch);
        System.out.println(smartWatch.getPrecio());

    }
}