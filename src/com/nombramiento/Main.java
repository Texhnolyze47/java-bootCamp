package com.nombramiento;

import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        // notacion ungara
        UserManager oUserManager = new UserManager();

    }
}
// las clases deben utilizar nombre sustantivos
// y tiene de claro su uso mediante su nombre
// en java deben empezar por mayuscula
class  ReverseString {

}

// ejemplo 2 de una clase
class UserManager{
    // los nombres de las variables tiene que ser autodescriptivos
    // su nombre tiene que empezar con minusculas
    private int contador = 0;

    // el nombre debe estar en mayúsculas y se debe separar con un guion bajo
    public final static int  MAX_USERS = 15;
    // los metodos empiezan con una minuscula y deben ser verbos
    public void createUser(){
        int [] numeros = {1,2,3,4,5};
        //si tiene más de una palabra la incial debe ser Mayuscula
        boolean diaONoche;

        for (int i = 0; i < numeros.length; i++) {

        }
        // notacion ungara
        int [] aNumeros = {1,2,3,4,5};
        boolean bEsDia = false;
        char cLetra = 'a';
        double dValor = 5.1d;
        Hashtable <String, Integer> hUsuarios = new Hashtable();

        int iValores = 5;
        long iValoresLong = 5;

        String sCadena = "hola";
        var vVariable = 5;
        byte yByte = 1;

    }
}
// notacion ungara

enum nEstado{
    INICIAL,
    EN_PROGRESO
};

// en las interfaces deben utilizar nombres que sean adjetivos siempre que sea posible
// si estamos usando el inglés como idioma de desarrollo debe acabar en -ble

interface Iterable{}
interface Serializable{}

// En español
interface Iterador{}
interface Serializador{}
