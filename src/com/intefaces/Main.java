package com.intefaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Coche honda = new Coche("HONDA","Automatico");
        Coche nissan = new Coche("Nissan","Automatico");

        CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.save(honda);
        cocheCRUD.save(nissan);

        List <Coche> coches = cocheCRUD.findAll();
        System.out.println(coches);

        cocheCRUD.delete(honda);
        System.out.println(coches);


    }
}
