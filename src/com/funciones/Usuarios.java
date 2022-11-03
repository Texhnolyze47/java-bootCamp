package com.funciones;

import java.util.ArrayList;

public class Usuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();



//    public void addUsuario(String nombre, String apellido, int edad, boolean puedeConducir){
//        Usuario usuario = new Usuario();
//        usuario.nombre = nombre;
//        usuario.apellidos = apellido;
//        usuario.edad = edad;
//        usuario.puedeConducir = puedeConducir;
//
//
//        usuarios.add(usuario);
//    }

//    public void addUsuario(Usuario usuario) throws UserException {
//    if (usuarios.contains(usuario)){
//        throw new UserRegisteredException("Usuario ya existe: " + usuario.nombre);
//    }
//        usuarios.add(usuario);
//    }

    /**
     * Tanto el codigo de arriba o el abajo tiene la misma funcion
     * normalmente se le da proridad a la funcion que agrega de forma interativa
     * @param usuarios
     * @throws UserException
     */
    public void addUsuarios(Usuario ...usuarios) throws UserException {
        for (Usuario usuario : usuarios){
        if (this.usuarios.contains(usuario)){
            throw new UserRegisteredException("Usuario ya existe: " + usuario.nombre);
        }
            this.usuarios.add(usuario);
        }
    }
}
