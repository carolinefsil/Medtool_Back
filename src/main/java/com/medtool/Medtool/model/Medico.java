package com.medtool.Medtool.model;


import javax.persistence.*;

@Entity
@Table(name = "TB_MEDICO")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMedico;
    private String nomeMedico;

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "idMedico=" + idMedico +
                ", nomeMedico='" + nomeMedico + '\'' +
                '}';
    }

    public Medico() {
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

    public Medico(Long idMedico) {
        this.idMedico = idMedico;
    }
}

