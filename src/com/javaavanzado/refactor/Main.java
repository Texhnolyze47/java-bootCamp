package com.javaavanzado.refactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(esOracleEnMacOS());


    }

    public static boolean esOracleEnMacOS(){
        boolean runTimeOracle =  System.getProperty("java.runtime.name").contains("Oracle");
        boolean osVersion = System.getProperty("os.version").compareTo("11.6") == 0 ? true : false;
        if ( runTimeOracle && osVersion){
            System.out.println("Es oracle JVM");
            return true;
        }
        return  false;
    }


    public static boolean hoyEsDomingo(int numero){
    boolean isDomingo = (numero == 7 ? true : false);

    return isDomingo;

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

    public static void claseBuilder(){
        ConstructorLargoBuilder cosa = new ConstructorLargoBuilder("marcar")
                .conModelo("modelo")
                .conMotor("motor")
                .conPuertas(4);
    }
}
