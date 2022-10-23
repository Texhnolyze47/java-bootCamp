package com.io;

public class StringReverse {

    public static void main(String[] args) {

        String texto = "Hola soy un string";
        System.out.println(reverse(texto));
    }

    public static String reverse(String texto){
        String textoReverso = "";
        for (int i = 0; i < texto.length(); i++){
           textoReverso = texto.charAt(i) + textoReverso;
        }
        return textoReverso;
    }

}
