package com.example.user.dzienniczekucznia.remote;

import com.example.user.dzienniczekucznia.models.Grupy;

import java.security.acl.Group;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;



public interface Api {

    String BASE_URL = "http://192.168.0.28:8070/";

    @GET("/groupmanagment/all")
    Call<List<Grupy>> getGrupy();
}