package com.intefaces;

public class Coche {

    private String modelo;
    private String marcha;

    public Coche() {
    }

    public Coche(String modelo, String marcha) {
        this.modelo = modelo;
        this.marcha = marcha;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", marcha='" + marcha + '\'' +
                '}';
    }
}
