package com.softtek.practicae02back.exceptions;

public class AutobusNotFoundException extends RuntimeException {
    private String matricula;
    public AutobusNotFoundException(String mensaje, String matricula) {
        super(mensaje);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
