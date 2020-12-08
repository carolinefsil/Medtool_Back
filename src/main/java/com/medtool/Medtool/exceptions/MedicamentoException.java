package com.medtool.Medtool.exceptions;

public class MedicamentoException extends RuntimeException {

    public MedicamentoException(String mensagem) {
        super(mensagem);
    }

    public MedicamentoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}