package com.medtool.Medtool.exceptions;

public class MedicoException extends RuntimeException {

    public MedicoException(String mensagem) {
        super(mensagem);
    }

    public MedicoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}