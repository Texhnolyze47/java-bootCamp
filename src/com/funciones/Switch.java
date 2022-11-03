package com.funciones;

public class Switch {
    public static void main(String[] args) {
        determinarFruta("Melocoton");
    }
    public static void determinarFruta(String fruta){

        if (fruta == "Pera"){
            System.out.println("Es una pera");
        } else if (fruta == "Es un Melocoton") {
            System.out.println("Es un melocoton");
        } else if (fruta == "Banana") {
            System.out.println("Es una banana");
        } else if (fruta == "Es una manzana") {
            
        }else {
            System.out.println("Es otra cosa");
        }
        switch (fruta){
            case "Pera":
                System.out.println("Es una pera");
                break;
            case "Melocoton":
                System.out.println("Es un melocoton");
                break;
            case "Banana":
                System.out.println("Es una banana");
                break;
            case "Manzana":
                System.out.println("Es una manzana");
                break;
            default:
                System.out.println("Es otra cosa");
                break;
        }
    }


}
