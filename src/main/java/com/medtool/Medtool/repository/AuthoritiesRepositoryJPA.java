package com.medtool.Medtool.repository;

import com.medtool.Medtool.model.Authorities;
import com.medtool.Medtool.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesRepositoryJPA extends JpaRepository<Authorities, String> {

    public Users findByUsername(String user);

    public void deleteByUsername(String user);
}
