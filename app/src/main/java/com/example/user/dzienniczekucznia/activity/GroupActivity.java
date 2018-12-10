package com.example.user.dzienniczekucznia.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.example.user.dzienniczekucznia.R;
import com.example.user.dzienniczekucznia.Testy.BackendUtil;
import com.example.user.dzienniczekucznia.Testy.GrupaAdapter;
import com.example.user.dzienniczekucznia.models.Grupy;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GroupActivity extends AppCompatActivity {

    private ListView lstGatunek;
    private GrupaAdapter grupaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group2);


        lstGatunek = (ListView)findViewById(R.id.lstGatunek);


        View header = (View)getLayoutInflater().inflate(R.layout.layout_header_gatunek, null);
        lstGatunek.addHeaderView(header);
    }

    private void getAllGatunek(final Activity _activity){
        try{
            Call<List<Grupy>> gatuneks = BackendUtil.getInstance().getStudentService().getUser();
            gatuneks.enqueue(new Callback<List<Grupy>>() {
                @Override
                public void onResponse(Call<List<Grupy>> call, Response<List<Grupy>> response) {
                    if(response.isSuccessful()){
                        Log.d("Biblioteka - onResponse", "Success: " + response.body().toString());
                        List<Grupy> responseData = response.body();
                        if(grupaAdapter == null) {
                            grupaAdapter = new GrupaAdapter(_activity, R.layout.layout_item_gatunek, responseData);
                        }else {
                            grupaAdapter.clear();
                            grupaAdapter.addAll(responseData);
                            grupaAdapter.notifyDataSetChanged();
                        }
                        lstGatunek.setAdapter(grupaAdapter);
                    }else{
                        Log.d("Biblioteka -- onResse", "Failure: " + response.errorBody().toString());
                    }
                }

                @Override
                public void onFailure(Call<List<Grupy>> call, Throwable t) {
                    Log.e("Biblioteka - AonFailure","Fail: " + t.toString());
                }
            });
        }catch(Exception exp){
            Log.e("Biblioteka - gatunek", "Error: " + exp.toString());
        }
    }

    @Override
    public void onResume()
    {  // After a pause OR at startup
        super.onResume();
        getAllGatunek(this);
    }


}

