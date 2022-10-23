package com.javaavanzado.refactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numeros = { 12,23,45,1,9};
        imprimirMayorMenor(numeros);
    }

    public static void imprimirMayorMenor(int []numeros){
        int mayor = Arrays.stream(numeros)
                .reduce(0,(a,b) -> a > b ? a : b);
        int menor = Arrays.stream(numeros)
                .reduce( numeros[0], (a,b) -> a < b  ? a : b);

        System.out.println("Mayor: " + mayor + " Menor: " + menor);
    }
}
