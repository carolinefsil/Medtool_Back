package com.medtool.Medtool.exceptions;

public class PacienteNotFoundException extends RuntimeException {

    public PacienteNotFoundException(String mensagem) {
        super(mensagem);
    }

    public PacienteNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
