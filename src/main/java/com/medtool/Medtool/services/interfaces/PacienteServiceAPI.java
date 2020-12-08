package com.medtool.Medtool.services.interfaces;

import com.medtool.Medtool.model.Paciente;

import java.util.List;

public interface PacienteServiceAPI {

    public Paciente get(Long id);

    public List<Paciente> findAll();

    public Paciente create(Paciente paciente);

    public void update(Paciente paciente);

    public void remove(Long id);
}
