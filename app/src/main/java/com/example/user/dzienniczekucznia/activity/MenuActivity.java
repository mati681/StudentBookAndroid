package com.example.user.dzienniczekucznia.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.dzienniczekucznia.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;

public class MenuActivity extends AppCompatActivity {

    private ImageButton mLogOutBtn;
    private GoogleApiClient mGoogleApiClient;
    private ImageButton mOcenybtn;
    private ImageButton mOgloszeniabtn;
    private ImageButton mPlanbtn;
    private ImageButton mUwagibtn;
    private TextView mTextView;


    private GoogleSignInClient mGoogleSignInClient;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mOcenybtn = (ImageButton) findViewById(R.id.ocenybtn);
        mOcenybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MenuActivity.this, GroupActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MenuActivity.this.startActivity(myIntent);
                ;
            }
        });

        mOgloszeniabtn = (ImageButton) findViewById(R.id.ogloszeniabtn);
        mOgloszeniabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MenuActivity.this, OgloszeniaActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MenuActivity.this.startActivity(myIntent);
            }
        });

        mPlanbtn = (ImageButton) findViewById(R.id.planbtn);
        mPlanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MenuActivity.this, PlanActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MenuActivity.this.startActivity(myIntent);
            }
        });

        mUwagibtn = (ImageButton) findViewById(R.id.uwagibtn);
        mUwagibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MenuActivity.this, UwagiActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MenuActivity.this.startActivity(myIntent);
            }
        });


        mLogOutBtn = (ImageButton) findViewById(R.id.logOutBtn);
        mLogOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                android.os.Process.killProcess(android.os.Process.myPid());

            }
        });
    }
}

