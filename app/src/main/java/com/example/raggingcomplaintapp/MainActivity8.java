package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        //getting data
        String name = getIntent().getStringExtra("keyName");
        String surname = getIntent().getStringExtra("keySurname");
        String email = getIntent().getStringExtra("keyEmail");
        String password = getIntent().getStringExtra("keyPassword");

        btn_login = findViewById(R.id.button4);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this,MainActivity6.class);
                intent.putExtra("keyName",name);
                intent.putExtra("keySurname",surname);
                startActivity(intent);
            }
        });
    }
}