package com.cohesion;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("pepe");
        usuario.addVehiculo(new Vehiculo("coche"));

        Usuarios usuarios = new Usuarios();
        usuarios.meterUsuarios(usuario);

        Usuario userInfo = usuarios.obtener("pepe");
        System.out.println(userInfo.nombre);

        for(Vehiculo vehiculo: userInfo.vehiculo){
            System.out.println(vehiculo.tipo);
        }
    }
}
