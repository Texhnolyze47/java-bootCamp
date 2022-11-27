package com.correcionerrores;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
    Usuario usuario = null;
    Usuarios usuarios = new Usuarios(usuario);

    for (Usuario actual: usuarios.getUsuarios2()){
        try {
        System.out.println(actual.nombre);

        }catch (NullPointerException e){
            System.out.println("Exception es nulo");
        }
    }

    }


    public static int divisionPorCero(int valor, int dividendo) throws ArithmeticException, IOException {
        try {
            return valor / dividendo;

        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }

    }


//    public static void a(){
//        b();
//    }

//    public static void b(){
//        try{
//            int valor = 5 / 0;
//
//        } catch (Exception e){
//            System.out.println("Esto es una division por cero");
//            for (StackTraceElement valor: e.getStackTrace()){
//                System.out.println(" -> Linea: " + valor.getLineNumber() + " " +valor.getMethodName());
//            }
//
//        }
//    }
}
