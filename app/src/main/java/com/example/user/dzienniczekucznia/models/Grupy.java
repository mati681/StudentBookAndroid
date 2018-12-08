package com.example.user.dzienniczekucznia.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Grupy {

    private Long id;

    private String name;

    public Grupy() {

    }
    public Grupy(Long id, String name) {
        this.id = id;
        this.name = name;
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
