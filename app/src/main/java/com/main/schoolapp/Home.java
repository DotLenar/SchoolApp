package com.main.schoolapp;

import android.Manifest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void Login(View view) {
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }

    public void Register(View view) {
        startActivity(new Intent(getApplicationContext(),Register.class));
        finish();
    }
}