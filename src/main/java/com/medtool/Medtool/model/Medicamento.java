package com.medtool.Medtool.model;


import javax.persistence.*;
import java.io.Serializable;

@Table(name = "TB_MEDICAMENTO")
@Entity
public class Medicamento implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idMedicamento;

    private String nomeMedicamento;

    public Long getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Long idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "idMedicamento=" + idMedicamento +
                ", nomeMedicamento='" + nomeMedicamento + '\'' +
                '}';
    }

    public Medicamento() {
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
}
