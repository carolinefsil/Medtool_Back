package com.medtool.Medtool.repository;

import com.medtool.Medtool.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepositoryJPA extends JpaRepository <Paciente, Long> {
}
