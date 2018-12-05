package com.example.user.dzienniczekucznia.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Przedmioty {

    @SerializedName("id")
    @Expose
    private Long id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("typeOfActivities")
    @Expose
    private Integer typeOfActivities;

    @SerializedName("smark")
    @Expose
    private Integer smark;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTypeOfActivities() {
        return typeOfActivities;
    }

    public Integer getSmark() {
        return smark;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfActivities(Integer typeOfActivities) {
        this.typeOfActivities = typeOfActivities;
    }

    public void setSmark(Integer smark) {
        this.smark = smark;
    }







}