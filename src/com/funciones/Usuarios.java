package com.funciones;

import java.util.ArrayList;
// comentario de intecionalidad

/**
 * La clase Usuarios implementa diversos metodos para la gestión del
 * modelo "Usuario".
 *
 * El objetivo de esta clase es sustituir a la vieja clase Usuarios Manager
 * tras una refactorización donde mantener el codigo antiguo era más costoso
 * que implementrar esta nueva clase
 *
 * A consecuencia de estos cambios, y al mantener durante un tiempo de transicion
 * la vieja clase, se recomienda utilizar un patron "facade" que esconda al
 * desarrollador final esta transicion
 *
 * Al finalizar el patron facade, en primer instancia, el desarrollador deberá invocar
 * a los nuevos métodos, para garantizar a futuro, no deba volver a cambiar el codigo que interactua con la
 * base de datos de usuarios
 */
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
     * Texhnolyze47@03/11/2022
     * Cambio la implementación a una con argumentos variables
     *
     * Esta función añade un número variable de objetos del tipo Usuario
     * en la instancia actual
     */
    public void addUsuarios(Usuario ...usuarios) throws UserException {
        for (Usuario usuario : usuarios){
        if (this.usuarios.contains(usuario)){
            // TODO: Deriamos devolver un UserRegisteredException, pero aún no existe
            throw new UserException("Usuario ya existe: " + usuario.nombre);
        }
            this.usuarios.add(usuario);
        }
    }
}
