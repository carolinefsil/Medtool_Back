package com.medtool.Medtool.repository;


import com.medtool.Medtool.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepositoryJPA  extends JpaRepository<Medicamento, Long> {
}
