package com.objects;

public class SmartPhone extends SmartDevice {

    int ram;
    String sistema;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, int ram, String sistema) {
        super(marca, modelo, color);
        this.ram = ram;
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "ram=" + ram +
                ", sistema='" + sistema + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
