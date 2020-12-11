package com.medtool.Medtool.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table (name = "TB_PACIENTE")
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPaciente;

    private String nomePaciente;




    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", nomePaciente='" + nomePaciente + '\'' +
                '}';
    }

    public Paciente() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Paciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }
}
