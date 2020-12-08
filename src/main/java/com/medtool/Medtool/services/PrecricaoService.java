package com.medtool.Medtool.services;

import com.medtool.Medtool.exceptions.PrescricaoNotFoundException;
import com.medtool.Medtool.model.Prescricao;
import com.medtool.Medtool.repository.PrecricaoRepositoryJPA;
import com.medtool.Medtool.services.interfaces.PrecricaoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PrecricaoService implements PrecricaoServiceAPI {

    @Autowired(required=true)
    private PrecricaoRepositoryJPA repositoryJPA;

    @Transactional(readOnly = true)
    public Prescricao get(Long id){

        try {
            Prescricao prescricao = repositoryJPA.findById(id).get();
            return prescricao;
        } catch (Exception ex) {
            throw new PrescricaoNotFoundException(String.format("Prescrição não encontrada: %s ", id));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Prescricao> findAll() {

        return repositoryJPA.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Prescricao create(Prescricao prescricao) {

        return repositoryJPA.save(prescricao);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Prescricao prescricao) {
        repositoryJPA.save(prescricao);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }
}