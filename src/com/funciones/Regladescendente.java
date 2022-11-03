package com.funciones;

public class Regladescendente {
    public static void main(String[] args) {
        a();
    }

    /**
     * Esto se debe evitar
     */

    public static void a(){ b();}

    public static void b(){ c();}

    public static void c(){d();}


    public static void d(){ e();}
    public static void e(){
        System.out.println("Estoy en e");
    }


}
