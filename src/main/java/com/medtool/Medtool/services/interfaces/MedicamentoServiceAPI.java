package com.medtool.Medtool.services.interfaces;


import com.medtool.Medtool.model.Medicamento;

import java.util.List;

public interface MedicamentoServiceAPI {

    public Medicamento get(Long id);

    public List<Medicamento> findAll();

    public Medicamento create(Medicamento medicamento);

    public void update(Medicamento medicamento);

    public void remove(Long id);
}
