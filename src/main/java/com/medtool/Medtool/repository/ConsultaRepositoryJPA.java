package com.medtool.Medtool.repository;

import com.medtool.Medtool.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepositoryJPA extends JpaRepository <Consulta , Long>  {
}
