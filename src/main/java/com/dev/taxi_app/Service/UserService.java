package com.dev.taxi_app.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.dev.taxi_app.Model.User;

@Service
public class UserService implements UserServiceInterface {

    private static final HashMap<Integer, User> USER_REPOSITORY_MAP = new HashMap<>();

    private static final AtomicInteger USER_ID_HOLDER = new AtomicInteger();


    @Override
    public void create(User user){

        final int userId = USER_ID_HOLDER.incrementAndGet();
        user.setUserId(userId);
        USER_REPOSITORY_MAP.put(userId,user); 

    }

    @Override
    public List<User> readAll(){

        return new ArrayList<>(USER_REPOSITORY_MAP.values());

    }

    @Override
    public User read(int userId){

        return USER_REPOSITORY_MAP.get(userId);

    }
    @Override
    
    public boolean update(User user, int userId){

        if(USER_REPOSITORY_MAP.containsKey(userId)){
            user.setUserId(userId);
            USER_REPOSITORY_MAP.put(userId, user);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int userId){

        return USER_REPOSITORY_MAP.remove(userId) != null;
    }

}
