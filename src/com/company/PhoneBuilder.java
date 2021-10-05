package com.company;

public class PhoneBuilder {

    private String os;
    private int ram;
    private String brand;
    private String processor;
    private double screenSize;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os, ram, brand, processor, screenSize, battery);
    }
}
