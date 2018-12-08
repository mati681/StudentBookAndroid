package com.example.user.dzienniczekucznia.remote;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {
    @GET("/groupmanagement/all")
    Call<JSONResponse> getJSON();
}
