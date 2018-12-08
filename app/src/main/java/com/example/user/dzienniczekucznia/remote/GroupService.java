package com.example.user.dzienniczekucznia.remote;

import com.example.user.dzienniczekucznia.models.Grupy;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GroupService {

    String BASE_URL = "http://192.168.157.1:8070";

    @GET("/groupmanagement/all")
    Call<ArrayList<Grupy>> getGrupy();
}

