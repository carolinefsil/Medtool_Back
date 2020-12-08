package com.medtool.Medtool.exceptions;

public class PacienteException extends RuntimeException {

    public PacienteException(String mensagem) {
        super(mensagem);
    }

    public PacienteException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}