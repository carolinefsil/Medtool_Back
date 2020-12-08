package com.medtool.Medtool.services;

import com.medtool.Medtool.model.Users;
import com.medtool.Medtool.repository.UsersRepositoryJPA;
import com.medtool.Medtool.services.interfaces.UsersServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UsersService implements UsersServiceAPI {

    @Autowired
    private UsersRepositoryJPA repositoryJPA;

    @Override
    @Transactional(readOnly = true)
    public Users get(String user) {

        Users username = repositoryJPA.findByUsername(user);
        return username;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Users> findAll() {
        return repositoryJPA.findAll();
    }


    @Transactional(readOnly = false)
    public Users create(Users user) {
        return repositoryJPA.save(user);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Users user) {
        repositoryJPA.save(user);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(String user) {
        repositoryJPA.deleteByUsername(user);
    }
}
