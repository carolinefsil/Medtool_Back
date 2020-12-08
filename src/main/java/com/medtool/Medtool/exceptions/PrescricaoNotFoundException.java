package com.medtool.Medtool.exceptions;

public class PrescricaoNotFoundException extends RuntimeException {

    public PrescricaoNotFoundException(String mensagem) {
        super(mensagem);
    }

    public PrescricaoNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
