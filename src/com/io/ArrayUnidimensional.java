package com.io;

// Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

public class ArrayUnidimensional {
    public static void main(String[] args) {
        String [] nombres = new String[4];

        nombres[0] = "Erick";
        nombres[1] = "Josa";
        nombres[2] = "Luis";
        nombres[3] = "Ivan";

        for (String nombre: nombres) {
            System.out.println(nombre);
        }

    }
}
