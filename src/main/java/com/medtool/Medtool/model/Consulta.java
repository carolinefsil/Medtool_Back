package com.medtool.Medtool.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TB_CONSULTA")
public class Consulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idConsuta;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medico")
    private Medico medico;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente")
    private Paciente paciente;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medicamento")
    private Medicamento medicamento;

    private String posologia;

    public Long getIdConsuta() {
        return idConsuta;
    }

    public void setIdConsuta(Long idConsuta) {
        this.idConsuta = idConsuta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "idConsuta=" + idConsuta +
                ", data=" + data +
                ", medico=" + medico +
                ", paciente=" + paciente +
                ", medicamento=" + medicamento +
                ", posologia='" + posologia + '\'' +
                '}';
    }
}
