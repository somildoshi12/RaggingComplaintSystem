package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    TextView complaint,name0,date0,college0,location0,phone0;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        if(Build.VERSION.SDK_INT >= 21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.black));
        }

        name0 = findViewById(R.id.textView28);
        date0 = findViewById(R.id.textView35);
        college0 = findViewById(R.id.textView33);
        location0 = findViewById(R.id.textView37);
        phone0 = findViewById(R.id.textView30);

        //getting data
        String name = getIntent().getStringExtra("keyName");
        String surname = getIntent().getStringExtra("keySurname");
        name0.setText(name+" "+surname);
        String phone = getIntent().getStringExtra("keyPhone");
        phone0.setText(phone);
        String college1 = getIntent().getStringExtra("keyCollege");
        college0.setText(college1);
        String date1 = getIntent().getStringExtra("keyDate");
        date0.setText(date1);
        String location1 = getIntent().getStringExtra("keyLocation");
        location0.setText(location1);
        String complaint1 = getIntent().getStringExtra("keyComplaint");

        String email = getIntent().getStringExtra("keyEmail");
        String password = getIntent().getStringExtra("keyPassword");

        complaint = findViewById(R.id.textView39);
        complaint.setMovementMethod(new ScrollingMovementMethod());
        complaint.setText(complaint1);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity7.this,MainActivity9.class);

                intent.putExtra("keyName",name);
                intent.putExtra("keySurname",surname);
                intent.putExtra("keyCollege",college1);
                intent.putExtra("keyDate",date1);
                intent.putExtra("keyLocation",location1);
                intent.putExtra("keyComplaint",complaint1);
                intent.putExtra("keyPhone",phone);

                intent.putExtra("keyEmail",email);
                intent.putExtra("keyPassword",password);

                startActivity(intent);
                finish();
            }
        },4000);

    }
}