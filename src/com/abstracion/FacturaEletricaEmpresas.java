package com.abstracion;

public class FacturaEletricaEmpresas extends FacturaElectrica {
    @Override
    double calcular() {
        return 0.55 + obtenerImpuesto(0.55);
    }


}
