package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    Button btn_login;
    EditText user,pass;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        if(Build.VERSION.SDK_INT >= 21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.black));
        }

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


        user = findViewById(R.id.editTextTextPersonName);
        pass = findViewById(R.id.editTextTextPersonName2);


        btn_login = findViewById(R.id.button4);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user0 = user.getText().toString();
                String pass0 = pass.getText().toString();

                if(user0.equals(email) && pass0.equals(password)){

                    Toast.makeText(MainActivity8.this, "Correct", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity8.this,MainActivity6.class);

                    intent.putExtra("keyName",name);
                    intent.putExtra("keySurname",surname);
                    intent.putExtra("keyEmail",email);
                    intent.putExtra("keyPassword",password);
                    intent.putExtra("keyPhone",phone);

                    intent.putExtra("keyCollege",college1);
                    intent.putExtra("keyDate",date1);
                    intent.putExtra("keyLocation",location1);
                    intent.putExtra("keyComplaint",complaint1);

                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity8.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity8.this,MainActivity2.class);

                    intent.putExtra("keyName",name);
                    intent.putExtra("keySurname",surname);
                    intent.putExtra("keyEmail",email);
                    intent.putExtra("keyPassword",password);
                    intent.putExtra("keyPhone",phone);

                    intent.putExtra("keyCollege",college1);
                    intent.putExtra("keyDate",date1);
                    intent.putExtra("keyLocation",location1);
                    intent.putExtra("keyComplaint",complaint1);

                    startActivity(intent);
                }
            }
        });
    }
}