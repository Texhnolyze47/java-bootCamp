package com.correcionerrores;

public class UsuariosNombreCortoException extends UsuariosExceptions {
    public UsuariosNombreCortoException(String message) {
        super("Longitud de nombre corta => " + message);
    }
}
