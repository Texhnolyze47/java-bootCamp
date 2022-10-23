package com.objects;

public class SmartPhone {

    String marca;
    String modelo;
    String color;
    int ram;
    String sistema;

    private SmartPhone() {

    }


    public SmartPhone (String marca) {
        this.marca = marca;
    }

    public SmartPhone conModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public SmartPhone conColor(String color) {
        this.color = color;
        return this;
    }

    public SmartPhone conRam(int ram) {
        this.ram = ram;
        return this;
    }

    public SmartPhone conSistema(String sistema) {
        this.sistema = sistema;
        return this;
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
