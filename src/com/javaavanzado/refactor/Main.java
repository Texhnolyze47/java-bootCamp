package com.javaavanzado.refactor;

public class Main {
    public static void main(String[] args) {
        int [] numeros = { 12,23,45,1,9};
        imprimirMayorMenor(numeros);
    }

    public static void imprimirMayorMenor(int []numeros){
        int mayor = 0;
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (mayor < numeros[i]){
                mayor = numeros[i];
            }
            if (menor > numeros[i]){
                menor = numeros[i];
            }
        }
        System.out.println("Mayor: " + mayor + " Menor: " + menor);
    }
}
