package com.company;

public class Phone {

    private String os;
    private int ram;
    private String brand;
    private String processor;
    private double screenSize;
    private int battery;

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
