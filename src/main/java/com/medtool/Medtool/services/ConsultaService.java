package com.medtool.Medtool.services;

import com.medtool.Medtool.exceptions.ConsultaNotFoundException;
import com.medtool.Medtool.model.Consulta;
import com.medtool.Medtool.repository.ConsultaRepositoryJPA;
import com.medtool.Medtool.services.interfaces.ConsultaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ConsultaService implements ConsultaServiceAPI {

    @Autowired(required=true)
    private ConsultaRepositoryJPA repositoryJPA;

    @Transactional(readOnly = true)
    public Consulta get(Long id){

        try {
            Consulta consulta = repositoryJPA.findById(id).get();
            return consulta;
        } catch (Exception ex) {
            throw new ConsultaNotFoundException(String.format("Consulta não foi marcada: %s ", id));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List <Consulta> findAll() {

        return repositoryJPA.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Consulta create(Consulta consulta) {

        return repositoryJPA.save(consulta);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Consulta consulta) {
        repositoryJPA.save(consulta);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }
}
