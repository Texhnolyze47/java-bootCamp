package com.correcionerrores;

public class UsuariosYaRegsitradosException  extends UsuariosExceptions {
    public UsuariosYaRegsitradosException(String message) {
        super("Ya registrado => " + message);
    }
}
