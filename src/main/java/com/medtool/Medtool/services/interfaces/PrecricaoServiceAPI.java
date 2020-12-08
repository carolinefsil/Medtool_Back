package com.medtool.Medtool.services.interfaces;

import com.medtool.Medtool.model.Prescricao;

import java.util.List;

public interface PrecricaoServiceAPI {


    public Prescricao get(Long id);

    public List<Prescricao> findAll();

    public Prescricao create(Prescricao prescricao);

    public void update(Prescricao prescricao);

    public void remove(Long id);
}
