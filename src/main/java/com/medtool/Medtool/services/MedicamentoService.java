package com.medtool.Medtool.services;

import com.medtool.Medtool.exceptions.MedicamentoNotFoundException;
import com.medtool.Medtool.model.Medicamento;
import com.medtool.Medtool.repository.MedicamentoRepositoryJPA;
import com.medtool.Medtool.services.interfaces.MedicamentoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MedicamentoService implements MedicamentoServiceAPI {

    @Autowired(required=true)
    private MedicamentoRepositoryJPA repositoryJPA;

    @Transactional(readOnly = true)
    public Medicamento get(Long idMedicamento){

        try {
            Medicamento medicamento = repositoryJPA.findById(idMedicamento).get();
            return medicamento;
        } catch (Exception ex) {
            throw new MedicamentoNotFoundException(String.format("Medicamento não encontrado: %s ", idMedicamento));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Medicamento> findAll() {

        return repositoryJPA.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Medicamento create(Medicamento medicamento) {

        return repositoryJPA.save(medicamento);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Medicamento medicamento) {
        repositoryJPA.save(medicamento);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }
}