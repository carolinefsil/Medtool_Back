package com.medtool.Medtool.exceptions;

public class ConsultaNotFoundException extends RuntimeException {

    public ConsultaNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ConsultaNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
