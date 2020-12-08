package com.medtool.Medtool.services;

import com.medtool.Medtool.exceptions.MedicoNotFoundException;
import com.medtool.Medtool.model.Medico;
import com.medtool.Medtool.repository.MedicoRepositoryJPA;
import com.medtool.Medtool.services.interfaces.MedicoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MedicoService implements MedicoServiceAPI {

    @Autowired(required=true)
    private MedicoRepositoryJPA repositoryJPA;

    @Transactional(readOnly = true)
    public Medico get(Long id){

        try {
            Medico medico = repositoryJPA.findById(id).get();
            return medico;
        } catch (Exception ex) {
            throw new MedicoNotFoundException(String.format("Medico não encontrado: %s ", id));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Medico> findAll() {

        return repositoryJPA.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Medico create(Medico medico) {

        return repositoryJPA.save(medico);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Medico medico) {
        repositoryJPA.save(medico);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }
}