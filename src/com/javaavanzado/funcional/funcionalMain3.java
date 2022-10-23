package com.javaavanzado.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class funcionalMain3 {


    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList<>();
        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");
        //muestra los elementro dentro del array list
        //nombres.stream().forEach(x -> System.out.println(x));

        //el inconveniente de usar el Stream una que haya consumido
        //el stream ya no se puede utlizar otra vez
        Stream <String> valores = nombres.stream()
                .map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("P"));
        valores.forEach(x -> System.out.println(x));

        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        var stNumeros = Arrays.stream(numeros);

        // esta syntax con los corches es la msima que la de arriba ya que la
        // una funciones lambda siempre llama a otra funcion
        var resultado = stNumeros.filter(x -> x % 2 == 0).reduce(0,(x,y) -> {
            System.out.println("X es: " + x + " Y es: " + y);
            return x + y;
        }) ;

        System.out.println("Mi Suma de pares es: " + resultado);
        //stNumeros.forEach(x -> System.out.println(x));

        //valores.forEach(x -> System.out.println(x));

    }


}
