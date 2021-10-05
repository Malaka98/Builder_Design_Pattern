package com.company;

public class Main {

    public static void main(String[] args) {

        Phone obj = new PhoneBuilder().setOs("Android").setRam(4).setBrand("Samsung")
                .setProcessor("SnapDragon").setScreenSize(6.5).setBattery(5000).getPhone();
        System.out.println(obj);

        Phone obj2 = new PhoneBuilder().setOs("Apple").setRam(4).setBrand("Samsung")
                .setScreenSize(6.5).getPhone();
        System.out.println(obj2);
    }
}
