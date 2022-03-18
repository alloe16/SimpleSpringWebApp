package com.example.springlab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test {
    @Autowired private Users usersTest;
    public List<UserEntity> Out(){
        return (List<UserEntity>) usersTest.findAll();
    }
    public void add(UserEntity User){
        usersTest.save(User);
    }
    public void delete(UserEntity User){
        usersTest.delete(User);
    }
}
