package com.cohesion;

import java.util.ArrayList;

public class Usuarios {

    //private int contador;
    ArrayList <Usuario> usuarios = new ArrayList<>();

    public Usuario obtener(String name){
        for (Usuario usuario : usuarios){
            if (usuario.nombre == name){
                return usuario;
            }
        }
        return null;
    }

    public void meterUsuarios(Usuario usuario){ usuarios.add(usuario);}

/*
    public void mimetodo( int contador){

        ArrayList <Integer> lista = new ArrayList<>();
        this.contador = contador;
        lista.add(contador);

        // esto un objeto ajeno
        // objeto cosa = new cosa();
        // cosa.getValores().getElementos().getSuperficiales();
        // se puede acceder con atributos pero no se puede relacionar con objetos ajenos
        // cosa.valores.elementos.superficiales
    }
    */



}
