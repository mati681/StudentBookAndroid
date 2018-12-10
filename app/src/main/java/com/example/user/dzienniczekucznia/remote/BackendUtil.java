package com.example.user.dzienniczekucznia.Remote;

import android.util.Log;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BackendUtil {
    private static BackendUtil instance;

    private static final String API_URL = "http://192.168.0.94:8070";
    //private static final String API_URL = "http://10.100.35.168:8080";

    private Retrofit retrofit;
   // private TokenCredentials tokenCredentials;
    private StudentService studentService;
  //  private Uzytkownik uzytkownik;

    private BackendUtil(){}

    public static BackendUtil getInstance(){
        if(instance == null){
            instance = new BackendUtil();
        }
        return instance;
    }

    private void initBackendConnection() throws Exception{
        try {
            retrofit = new Retrofit.Builder().baseUrl(API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            studentService = retrofit.create(StudentService.class);
        }catch (Exception exp){
            Log.e("Student-initBackend","Error: " + exp.getStackTrace().toString());
            throw exp;
        }
    }
    public StudentService getStudentService() throws Exception {
        if(studentService == null){
            initBackendConnection();
        }
        return studentService;
    }

   /* public TokenCredentials getTokenCredentials() {
        return tokenCredentials;
    }

    public void setTokenCredentials(TokenCredentials tokenCredentials) {
        this.tokenCredentials = tokenCredentials;
    }



    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }*/
}