package com.funciones;

import java.util.Arrays;

public class NombresParametros {
    public static void main(String[] args) {
        int [] iNumeros = { 1,2,3,4,5};
        int resultado = sumarNumeros(iNumeros);
        int resultadoDos = sumar4Valores(1,2,3,4);


        System.out.println(resultado);
        System.out.println(resultadoDos);

        System.out.println(sumarInfinitamente(1,2,3,4,5,6,7));
        System.out.println(sumarInfinitamente(1,2));
        System.out.println(sumarInfinitamente(1,2,4));


    }
    //funcion monadicas
//    public static int sumarNumeros(int []numeros){
//        int resultado = 0;
//        for (int numero: numeros){
//            resultado += numero;
//        }
//        return resultado;
//    }
    //funcion con argumentos variables
    public static int sumarInfinitamente(int ...numeros){
        int resultado = 0;
        for (int numero: numeros){
            resultado += numero;
        }
        return resultado;
    }

    public static int sumarNumeros(int []numeros){
       return Arrays.stream(numeros).reduce(0, (a,b) -> a + b);

    }

    public static int sumarValores(int valorA, int valorB){
        return valorA + valorB;
    }

    public static int sumar3Valores(int valorA, int valorB, int valorC){
        return valorA + valorB + valorC;
    }

    public static int sumar4Valores(int valorA, int valorB, int valorC, int valorD){
        return valorA + valorB + valorC + valorD;
    }





}
