package com.formato;

import java.util.ArrayList;

public class Usuarios {
    ArrayList <String> usuarios = new ArrayList<>();
    private int contador = 0;

    public String obtenerUsuarios(){
        String variable1;
        String variable2;
        int contador1;
        double valor3;

        for(String usuario: usuarios){
            return usuario;
        }

        return obtenerUsuariosBaseDeDatos();
    }

    public String obtenerUsuarios(int idUsuario){  return obtenerUsuariosBaseDeDatos();  }

    public String obtenerUsuarios(int idUsuario,String nombre){
        return obtenerUsuariosBaseDeDatos();
    }

    public String obtenerUsuariosBaseDeDatos(){
        return conectarABBDD();
    }

    public String conectarABBDD(){
        //Establecer conexion
        //Verificar conexion
        //Devolver handler
        return null;
    }
}
