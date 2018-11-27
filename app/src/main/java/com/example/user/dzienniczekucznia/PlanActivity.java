package com.example.user.dzienniczekucznia;


import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;

import android.app.Activity;
import android.app.ProgressDialog;

import android.os.Bundle;

import android.widget.Button;

import android.widget.TextView;



public class PlanActivity extends Activity {
    GoogleAccountCredential mCredential;
    private TextView mOutputText;
    private Button mCallApiButton;
    ProgressDialog mProgress;


    /**
     * Create the main activity.
     *
     * @param savedInstanceState previously saved instance data.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
    }
}