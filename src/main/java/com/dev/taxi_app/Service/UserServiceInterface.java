package com.dev.taxi_app.Service;

import java.util.List;

import com.dev.taxi_app.Model.User;

public interface UserServiceInterface {

    void create(User user);
 
    List<User> readAll();

    User read(int userId);

    boolean update(User user,int id);

    boolean delete(int userId);
    
}
