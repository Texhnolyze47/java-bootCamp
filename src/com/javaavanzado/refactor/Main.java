package com.javaavanzado.refactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ConstructorLargoBuilder cosa = new ConstructorLargoBuilder("marcar")
                .conModelo("modelo")
                .conMotor("motor")
                .conPuertas(4);
    }

    public static void imprimirMayorMenor(int []numeros){
        int mayor = Arrays.stream(numeros)
                .reduce(0,(a,b) -> a > b ? a : b);
        int menor = Arrays.stream(numeros)
                .reduce( numeros[0], (a,b) -> a < b  ? a : b);

        System.out.println("Mayor: " + mayor + " Menor: " + menor);
    }

    public static int ifAnidado1(){
        int valor1 = 10;
        int valor2 = 10;

        if (valor1 > valor2){
            return valor1;
        }

        return valor2;
    }
}
