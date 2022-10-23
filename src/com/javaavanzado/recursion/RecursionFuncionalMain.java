package com.javaavanzado.recursion;

import java.util.stream.IntStream;

public class RecursionFuncionalMain {
    public static void main(String[] args) {
        System.out.println(sumaFuncional(5));
    }

    public static int sumaFuncional(int numero){
        return IntStream.rangeClosed(1,5)
                .reduce(0,(a,b) -> a + b);
    }
}
