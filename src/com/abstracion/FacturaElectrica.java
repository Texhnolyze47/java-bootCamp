package com.abstracion;

abstract public class FacturaElectrica {

    double impuesto = 21;

    public double obtenerImpuesto(double precio){
        return precio * impuesto / 100;
    }


    abstract double calcular();

}
