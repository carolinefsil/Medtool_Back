package com.medtool.Medtool.exceptions;

public class ConsultaException extends RuntimeException {

    public ConsultaException(String mensagem) {
        super(mensagem);
    }

    public ConsultaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}