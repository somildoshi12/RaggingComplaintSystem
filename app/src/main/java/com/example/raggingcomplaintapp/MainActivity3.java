package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //getting data
        String name = getIntent().getStringExtra("keyName");
        String surname = getIntent().getStringExtra("keySurname");
        String email = getIntent().getStringExtra("keyEmail");
        String password = getIntent().getStringExtra("keyPassword");
        String phone = getIntent().getStringExtra("keyPhone");
        String college1 = getIntent().getStringExtra("keyCollege");
        String date1 = getIntent().getStringExtra("keyDate");
        String location1 = getIntent().getStringExtra("keyLocation");
        String complaint1 = getIntent().getStringExtra("keyComplaint");

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity3.this,MainActivity6.class);

                intent.putExtra("keyCollege",college1);
                intent.putExtra("keyDate",date1);
                intent.putExtra("keyLocation",location1);
                intent.putExtra("keyComplaint",complaint1);
                intent.putExtra("keyName",name);
                intent.putExtra("keySurname",surname);
                intent.putExtra("keyEmail",email);
                intent.putExtra("keyPassword",password);
                intent.putExtra("keyPhone",phone);

                startActivity(intent);
                finish();
            }
        },1500);
    }
}