package com.example.restdemo.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1, "Atika", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Zeynep", LocalDate.now().minusYears(35)));
        users.add(new User(3, "Evmez", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }


}
