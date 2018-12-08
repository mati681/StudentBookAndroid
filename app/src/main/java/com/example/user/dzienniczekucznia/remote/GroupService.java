package com.example.user.dzienniczekucznia.remote;

import com.example.user.dzienniczekucznia.models.Grupy;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.security.acl.Group;
import java.util.HashMap;
import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;


    public interface GroupService {

        @FormUrlEncoded
        @GET("/groupmanagment/all")
            //@HTTP(method = "POST", path = "/login", hasBody = true)
            // Call login(@Path("username") String username, @Path("password") String password);
       // Call<Grupy> grupy(@Path("id") long id, @Path("name") String name);
        //Call<User> login(@Body HashMap<String, String> parameters);
        Call<List<Group>> getGroup();
       // void getGroup(@Path("id") String id, @Path("name") String name, Callback<Group> group);


    }

