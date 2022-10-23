package com.javaavanzado.recursion;

import java.util.stream.IntStream;

public class RecursionMain {

    public static void main(String[] args) {

        System.out.println(sumaInterativa(5));

        System.out.println(sumaRecursiva(5));

        System.out.println(sumaFuncional(5));
         }

    public static int sumaInterativa(int max){
        int resultado = 0;

        for (int i = 0; i < max; i++) {
            resultado += i;
        }
        return resultado;
    }

    public static int sumaRecursiva (int numero){
        if (numero == 1){
            return  1;
        }
        return numero + sumaRecursiva( numero - 1) ;
    }
    public static  void headRecursion(int valor){
        if (valor == 0){
            return;
        }
        headRecursion(valor - 1);
        System.out.println(valor);

    }
    public static void tailRecursion (int valor){
        if (valor == 0){
            return;
        }
        System.out.println(valor);
        tailRecursion( valor -1 );
    }
    public static int sumaFuncional(int numero){
        return IntStream.rangeClosed(1,5)
                .reduce(0,(a,b) -> a + b);
    }

}

