package com.javaavanzado.funcional;

import com.intefaces.Main;

public class funcionalMain {

    public static void main(String[] args) {

    }


    //funcion pura
    public  static  int suma(int a, int b) {
        return a + b;
    }
    //funcion impura, debido a que no regresa el mismo valor siempre
    public  static  double sumaInpura(int a, int b) {
        double sumador = Math.random();
        return (double) a + (double) b + sumador;
    }
}
