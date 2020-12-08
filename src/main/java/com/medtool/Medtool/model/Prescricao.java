package com.medtool.Medtool.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table (name = "TB_PRESCRICAO")
public class Prescricao implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idPrecicao;

    private String posologia;


    public Long getIdPrecicao() {
        return idPrecicao;
    }

    public void setIdPrecicao(Long idPrecicao) {
        this.idPrecicao = idPrecicao;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    @Override
    public String toString() {
        return "Prescricao{" +
                "idPrecicao=" + idPrecicao +
                ", posologia='" + posologia + '\'' +
                '}';
    }

    public Prescricao() {
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
}
