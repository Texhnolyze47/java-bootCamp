package com.abstracion;

public class Main {
    public static void main(String[] args) {
        FacturaElectrica fe = new FacturaEletricaEmpresas();
        System.out.println(fe.calcular());

        FacturaElectrica fe2 = new FacturaElectricaUsuario();
        System.out.println(fe2.calcular());

    }
}
