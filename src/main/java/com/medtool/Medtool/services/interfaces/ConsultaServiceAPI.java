package com.medtool.Medtool.services.interfaces;

import com.medtool.Medtool.model.Consulta;

import java.util.List;

public interface ConsultaServiceAPI {

    public Consulta get(Long id);

    public List<Consulta> findAll();

    public Consulta create(Consulta consulta);

    public void update(Consulta consulta);

    public void remove(Long id);

}
