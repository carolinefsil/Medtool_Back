package com.medtool.Medtool.services;

import com.medtool.Medtool.exceptions.PacienteNotFoundException;
import com.medtool.Medtool.model.Paciente;
import com.medtool.Medtool.repository.PacienteRepositoryJPA;
import com.medtool.Medtool.services.interfaces.PacienteServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacienteService implements PacienteServiceAPI {

    @Autowired(required=true)
    private PacienteRepositoryJPA repositoryJPA;

    @Transactional(readOnly = true)
    public Paciente get(Long id){

        try {
            Paciente paciente = repositoryJPA.findById(id).get();
            return paciente;
        } catch (Exception ex) {
            throw new PacienteNotFoundException(String.format("Paciente não encontrado: %s ", id));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Paciente> findAll() {

        return repositoryJPA.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Paciente create(Paciente paciente) {

        return repositoryJPA.save(paciente);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Paciente paciente) {
        repositoryJPA.save(paciente);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }
}
