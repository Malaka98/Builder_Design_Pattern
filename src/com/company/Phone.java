package com.company;

public class Phone {

    private final String os;
    private final int ram;
    private final String brand;
    private final String processor;
    private final double screenSize;
    private final int battery;

    public Phone(String os, int ram, String brand, String processor, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.brand = brand;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}
