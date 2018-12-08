package com.example.user.dzienniczekucznia.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.user.dzienniczekucznia.R;
import com.example.user.dzienniczekucznia.models.Grupy;
import com.example.user.dzienniczekucznia.remote.Api;
import com.example.user.dzienniczekucznia.remote.GroupService;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.security.acl.Group;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OgloszeniaActivity extends AppCompatActivity {
    private static final String TAG ="OgloszeniaActivity";
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogloszenia);

        listView = (ListView) findViewById(R.id.listViewGroup);

        //calling the method to display the heroes
        getGroups();
    }

    private void getGroups() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();
        //creating the api interface
        Api api = retrofit.create(Api.class);

        //Here we are using the api method that we created inside the api interface
        Call<List<Grupy>> call = api.getGrupy();

       call.enqueue(new Callback<List<Grupy>>() {
           @Override
           public void onResponse(Call<List<Grupy>> call, Response<List<Grupy>> response) {


               List<Grupy> grupyList = response.body();
               System.out.println(grupyList);
               //Creating an String array for the ListView
               String[] heroes = new String[grupyList.size()];

               //looping through all the heroes and inserting the names inside the string array
               for (int i = 0; i < grupyList.size(); i++) {
                   heroes[i] = grupyList.get(i).getName();
               }

               //displaying the string array into listview
               listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_2, heroes));
               System.out.println(grupyList);
           }

           @Override
           public void onFailure(Call<List<Grupy>> call, Throwable t) {
               Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
           }
       });
}
}
