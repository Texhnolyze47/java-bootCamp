package com.correcionerrores;

import java.util.ArrayList;

public class Usuarios {


    ArrayList <String> usuarios = new ArrayList<>();
    ArrayList <Usuario> usuarios2 = new ArrayList<>();

    public Usuarios(Usuario usuario) {
        usuarios2.add(usuario);
    }

    public void meterUsuario(String nombre) throws UsuariosExceptions{
    if (nombre.length() < 5){
        throw new UsuariosNombreCortoException(nombre);
    }
        for (String usuario : usuarios){
            if (usuario == nombre){
                throw new UsuariosYaRegsitradosException(nombre);
            }
        }
        usuarios.add(nombre);
        System.out.println("usuario metido: " + nombre);
    }

    public ArrayList<Usuario> getUsuarios2() {
        return usuarios2;
    }
}
