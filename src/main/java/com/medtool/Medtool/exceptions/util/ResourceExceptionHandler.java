package com.medtool.Medtool.exceptions.util;

import com.medtool.Medtool.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler(ConsultaException.class)
    public ResponseEntity<ErrorDetails> handlerConsultaException(ConsultaException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(500l);
        error.setTitle("Consulta exception.");
        error.setUrl("http://erros.teste.com/500");
        error.setTimestamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

    @ExceptionHandler(ConsultaNotFoundException.class)
    public ResponseEntity<ErrorDetails> handlerConsultaException(ConsultaNotFoundException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(404l);
        error.setTitle("Consulta not found exception.");
        error.setUrl("http://erros.teste.com/404");
        error.setTimestamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(MedicamentoException.class)
    public ResponseEntity<ErrorDetails> handlerMedicamentoException(MedicamentoException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(500l);
        error.setTitle("Medicamento exception.");
        error.setUrl("http://erros.teste.com/500");
        error.setTimestamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

    @ExceptionHandler(MedicamentoNotFoundException.class)
    public ResponseEntity<ErrorDetails> handlerMedicamentoException(MedicamentoNotFoundException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(404l);
        error.setTitle("Medicamento not found exception.");
        error.setUrl("http://erros.teste.com/404");
        error.setTimestamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(MedicoException.class)
    public ResponseEntity<ErrorDetails> handlerMedicoException(MedicoException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(500l);
        error.setTitle("Medico exception.");
        error.setUrl("http://erros.teste.com/500");
        error.setTimestamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

    @ExceptionHandler(MedicoNotFoundException.class)
    public ResponseEntity<ErrorDetails> handlerMedicoException(MedicoNotFoundException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(404l);
        error.setTitle("Medico not found exception.");
        error.setUrl("http://erros.teste.com/404");
        error.setTimestamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
    @ExceptionHandler(PacienteException.class)
    public ResponseEntity<ErrorDetails> handlerPacienteException(PacienteException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(500l);
        error.setTitle("Paciente exception.");
        error.setUrl("http://erros.teste.com/500");
        error.setTimestamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

    @ExceptionHandler(PacienteNotFoundException.class)
    public ResponseEntity<ErrorDetails> handlerPacienteException(PacienteNotFoundException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(404l);
        error.setTitle("Paciente not found exception.");
        error.setUrl("http://erros.teste.com/404");
        error.setTimestamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
