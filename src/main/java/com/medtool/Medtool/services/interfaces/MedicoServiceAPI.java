package com.medtool.Medtool.services.interfaces;

import com.medtool.Medtool.model.Medico;

import java.util.List;

public interface MedicoServiceAPI {
    public Medico get(Long id);

    public List<Medico> findAll();

    public Medico create(Medico medico );

    public void update(Medico medico);

    public void remove(Long id);
}
