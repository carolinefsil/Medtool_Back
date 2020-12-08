package com.medtool.Medtool.services.interfaces;



import com.medtool.Medtool.model.Users;

import java.util.List;

public interface UsersServiceAPI {

    public Users get(String user);

    public List<Users> findAll();

    public Users create(Users user);

    public void update(Users user);

    public void remove(String user);
}
