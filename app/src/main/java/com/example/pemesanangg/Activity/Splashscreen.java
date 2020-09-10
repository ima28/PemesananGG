package com.example.pemesanangg.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.pemesanangg.R;

public class Splashscreen extends AppCompatActivity {
    private int load=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent login=new Intent(Splashscreen.this, Login.class);
                startActivity(login);

            }
        },load);
    }
}