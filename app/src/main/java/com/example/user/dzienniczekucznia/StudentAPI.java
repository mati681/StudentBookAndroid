package com.example.user.dzienniczekucznia;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StudentAPI {

    @GET("changes/")
    Call<List<Change>> loadChanges(@Query("q") String status);
}