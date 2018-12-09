package com.example.user.dzienniczekucznia.remote;


import com.example.user.dzienniczekucznia.models.Grupy;
import com.example.user.dzienniczekucznia.models.User;

import java.util.List;

public class JSONResponse {

    private Long id;

    private String name;

    private List <String> Users;

    public List<String> getUsers() {
        return Users;
    }
    public void setUsers(List<String> users){
        this.Users = Users;
    }



    private Grupy[] grupy;

    public Grupy[] getGrupy() {
        return grupy;
    }

    public Long getId() {
        return id;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}