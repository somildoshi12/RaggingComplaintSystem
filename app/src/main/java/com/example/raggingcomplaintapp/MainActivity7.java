package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    Button dash,web;
    TextView complaint,name0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        name0 = findViewById(R.id.textView28);

        //getting data
        String name = getIntent().getStringExtra("keyName");
        String surname = getIntent().getStringExtra("keySurname");
        name0.setText(name+" "+surname);
        String college1 = getIntent().getStringExtra("keyCollege");
        String date1 = getIntent().getStringExtra("keyDate");
        String location1 = getIntent().getStringExtra("keyLocation");
        String complaint1 = getIntent().getStringExtra("keyComplaint");

        dash = findViewById(R.id.button12);
        web = findViewById(R.id.button13);
        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this,MainActivity6.class);
                startActivity(intent);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.antiragging.in/"));
                startActivity(intent);
            }
        });

        complaint = findViewById(R.id.textView39);
        complaint.setMovementMethod(new ScrollingMovementMethod());
        //complaint.setText(str);

    }
}