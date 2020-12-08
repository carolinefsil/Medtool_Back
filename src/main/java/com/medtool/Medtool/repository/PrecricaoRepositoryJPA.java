package com.medtool.Medtool.repository;

import com.medtool.Medtool.model.Prescricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecricaoRepositoryJPA  extends JpaRepository <Prescricao, Long> {
}
