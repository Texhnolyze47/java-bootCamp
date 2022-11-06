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
 * Como consecuencia hay que cambiar las instacias de UserManager por Usuarios
 */
public class Usuarios {
    /** Lista de usuarios */
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    private boolean hoyEsDomingo(int numeroDia){
        //Si numeroDia es 0, lo consideramos domingo por el calendario
        // que siguen los estadounidenses
        return numeroDia == 0 || numeroDia == 7;
    }

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
     * Añade un nuevo usuario a la lista
     * @param usuarios Uno o varios objetos de tipo Usuarios
     * @throws UserException Si el usuario ya está registrado
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
