package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btn_login,btn_signup;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(Build.VERSION.SDK_INT >= 21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.black));
        }

        String name = getIntent().getStringExtra("keyName");
        String surname = getIntent().getStringExtra("keySurname");
        String email = getIntent().getStringExtra("keyEmail");
        String password = getIntent().getStringExtra("keyPassword");
        String phone = getIntent().getStringExtra("keyPhone");

        String college1 = getIntent().getStringExtra("keyCollege");
        String date1 = getIntent().getStringExtra("keyDate");
        String location1 = getIntent().getStringExtra("keyLocation");
        String complaint1 = getIntent().getStringExtra("keyComplaint");


        btn_login = findViewById(R.id.button3);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this,MainActivity8.class);

                intent.putExtra("keyEmail",email);
                intent.putExtra("keyPassword",password);
                intent.putExtra("keyName",name);
                intent.putExtra("keySurname",surname);
                intent.putExtra("keyPhone",phone);
                intent.putExtra("keyCollege",college1);
                intent.putExtra("keyDate",date1);
                intent.putExtra("keyLocation",location1);
                intent.putExtra("keyComplaint",complaint1);


                startActivity(intent);
            }
        });

        btn_signup = findViewById(R.id.button2);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}