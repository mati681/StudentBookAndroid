package com.example.user.dzienniczekucznia.api;

import com.example.user.dzienniczekucznia.api.Change;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StudentAPI {

    @GET("marks/")
    Call<List<Change>> loadChanges(@Query("q") String status);
}