package com.example.user.dzienniczekucznia.Remote;

import com.example.user.dzienniczekucznia.models.Grupy;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface StudentService {

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @GET("/groupmanagement/all")
        Call<List<Grupy>> getUser();

}
