package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    Button btn_logout,btn_complaint,btn_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        //getting data
        String name = getIntent().getStringExtra("keyName");
        String surname = getIntent().getStringExtra("keySurname");
        String email = getIntent().getStringExtra("keyEmail");
        String password = getIntent().getStringExtra("keyPassword");
        String phone = getIntent().getStringExtra("keyPhone");

        btn_logout = findViewById(R.id.button6);
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity6.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        btn_complaint = findViewById(R.id.button8);
        btn_complaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity6.this,MainActivity5.class);

                intent.putExtra("keyName",name);
                intent.putExtra("keySurname",surname);
                intent.putExtra("keyEmail",email);
                intent.putExtra("keyPassword",password);
                intent.putExtra("keyPhone",phone);

                startActivity(intent);
            }
        });


        btn_status = findViewById(R.id.button9);
        btn_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String college1 = getIntent().getStringExtra("keyCollege");
                String date1 = getIntent().getStringExtra("keyDate");
                String location1 = getIntent().getStringExtra("keyLocation");
                String complaint1 = getIntent().getStringExtra("keyComplaint");

                Intent intent = new Intent(MainActivity6.this,MainActivity7.class);

                intent.putExtra("keyName",name);
                intent.putExtra("keySurname",surname);
                intent.putExtra("keyCollege",college1);
                intent.putExtra("keyDate",date1);
                intent.putExtra("keyLocation",location1);
                intent.putExtra("keyComplaint",complaint1);
                /*intent.putExtra("keyEmail",email);
                intent.putExtra("keyPassword",password);*/
                intent.putExtra("keyPhone",phone);

                startActivity(intent);
            }
        });
    }
}