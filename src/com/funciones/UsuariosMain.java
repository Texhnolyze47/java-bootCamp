package com.funciones;

public class UsuariosMain {
    public static void main(String[] args) {

        // TODO: Mejorar el codigo con buenos comentarios

        Usuarios usuarios1 = new Usuarios();
        Usuario usuario = new Usuario();
        usuario.nombre = "Pepe";
        usuario.apellidos = "Botella";
        try {
            usuarios1.addUsuarios(usuario);
            usuarios1.addUsuarios(usuario);
        } catch (UserException e) {
            System.out.println("Error al añadir objeto de usuario " + e.getMessage());
        }

        //usuarios1.addUsuario("Pepe", "Botella",32,false);
        //usuarios1.addUsuario("Fran", "Botella",32,true);
    }
}
