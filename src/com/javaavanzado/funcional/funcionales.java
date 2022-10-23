package com.javaavanzado.funcional;

import java.util.function.Function;

public class funcionales {
    //esta es una funcion de alto nivel
    //por que regresa otra funcion
    private Function<String, String> toMayus =  x -> x.toUpperCase();
    private  Function<Integer, Integer> sumador = x -> x.sum(x,x);

    public void pruebas(){
        Saluda(toMayus,"Ivan");
//        System.out.println(toMayus.apply("Ivan"));
//        System.out.println(sumador.apply(5));
    }

    public void Saluda (Function<String, String>  mifuncion, String nombre){
        mifuncion.apply(nombre);
    }

}
