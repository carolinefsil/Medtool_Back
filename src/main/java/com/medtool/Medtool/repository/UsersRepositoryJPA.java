package com.medtool.Medtool.repository;

import com.medtool.Medtool.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepositoryJPA extends JpaRepository<Users, String> {

    public Users findByUsername(String user);

    public void deleteByUsername(String user);
}
