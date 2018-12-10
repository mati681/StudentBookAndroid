package com.example.user.dzienniczekucznia.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.dzienniczekucznia.R;
import com.example.user.dzienniczekucznia.data.DataAdapter;
import com.example.user.dzienniczekucznia.models.Grupy;

import com.example.user.dzienniczekucznia.remote.JSONResponse;
import com.example.user.dzienniczekucznia.remote.RequestInterface;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SiteActivity extends AppCompatActivity {

        private RecyclerView recyclerView;
        private ArrayList<Grupy> data;
        private DataAdapter adapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_site);
            adapter = new DataAdapter(data);


            initViews();
        }

        private void initViews() {
            recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
            recyclerView.setHasFixedSize(true);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
            loadJSON();


        }

        private void loadJSON() {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.0.94:8070")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            RequestInterface request = retrofit.create(RequestInterface.class);
            Call<JSONResponse> call = request.getJSON();
            call.enqueue(new Callback<JSONResponse>() {
                @Override
                public void onResponse(Call<JSONResponse> call, Response<JSONResponse> response) {

                    JSONResponse jsonResponse = response.body();
                    data = new ArrayList<>(Arrays.asList(jsonResponse.getGrupy()));
                    adapter.notifyDataSetChanged();
                    adapter.setData(data);

                    Log.e("RESPONSE11",response.toString());

                }

                @Override
                public void onFailure(Call<JSONResponse> call, Throwable t) {
                    Log.d("Error",t.getMessage());
                }
            });
        }
    }