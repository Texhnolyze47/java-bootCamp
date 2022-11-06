package com.funciones;

/**
 * La clase UserRegisteredException gestiona las excepciones
 * generados por gestor de usuarios cuando este ya existe
 */
public class UserRegisteredException extends UserException {
    public UserRegisteredException(String message) {
        super("Usuario ya existe: " + message);
    }
}
