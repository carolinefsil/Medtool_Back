package com.medtool.Medtool.exceptions;

public class MedicoNotFoundException extends RuntimeException {

    public MedicoNotFoundException(String mensagem) {
        super(mensagem);
    }

    public MedicoNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
