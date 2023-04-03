package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    public void btnHome(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void btnAboutUs(View view){
        Intent intent = new  Intent(this,aboutus.class);
        startActivity(intent);

}

}