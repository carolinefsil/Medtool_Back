package com.medtool.Medtool.exceptions;

public class PrescricaoException extends RuntimeException {

    public PrescricaoException(String mensagem) {
        super(mensagem);
    }

    public PrescricaoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}