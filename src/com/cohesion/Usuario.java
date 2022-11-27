package com.cohesion;

import java.util.ArrayList;

public class Usuario {
    String nombre;
    ArrayList<Vehiculo> vehiculo = new ArrayList<>();

    private Usuario(){}

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public void addVehiculo(Vehiculo vehiculo){
        this.vehiculo.add(vehiculo);
    }
}
