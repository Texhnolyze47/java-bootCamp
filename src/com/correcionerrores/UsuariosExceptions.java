package com.correcionerrores;

public class UsuariosExceptions extends  Exception{

    public UsuariosExceptions(String message) {

        super("Error al registrar => " + message);

        for (StackTraceElement elemento: getStackTrace()){
            System.out.println(elemento.getClassName() + " " + elemento.getMethodName());
        }
    }
}
