package com.objects;

public class SmartWatch{
    String marca;
    String modelo;
    String color;
    double pulgadas;
    String conectividad;

    private SmartWatch() {
    }

    public SmartWatch (String marca) {
        this.marca = marca;
    }

    public SmartWatch conModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public SmartWatch conColor(String color) {
        this.color = color;
        return this;
    }

    public SmartWatch conPulgadas(double pulgadas){
        this.pulgadas = pulgadas;
        return this;
    }


    public SmartWatch conConectividad(String conectividad){
        this.conectividad = conectividad;
        return this;
    }



    @Override
    public String toString() {
        return "SmartWatch{" +
                "pulgadas=" + pulgadas +
                ", conectividad='" + conectividad + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
