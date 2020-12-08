package com.medtool.Medtool.exceptions;

public class MedicamentoNotFoundException extends RuntimeException {

    public MedicamentoNotFoundException(String mensagem) {
        super(mensagem);
    }

    public MedicamentoNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
