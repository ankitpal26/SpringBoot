package com.jwt.example.services;

import com.jwt.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private  List<User> store = new ArrayList<>();

    public  UserService()
    {
        store.add(new User(UUID.randomUUID().toString(),"Ankit Pal","ankit@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Shiva Pal","shiva@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Harsh Pal","harsh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Gautam Pal","gautam@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }

}
