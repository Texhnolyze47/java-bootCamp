package com.funciones;
public class EjercicioSesion2 {

    public static void main(String[] args) {

        double precioSinIvA = 500.0;
        System.out.println("El precio con iva es " +  precioIVA(precioSinIvA));

    }

    public static double precioIVA( double precio ){
        double porcentajeIva = 0.16;
        double iva = porcentajeIva * precio;
        return precio + iva;
    }
}
