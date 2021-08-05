package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    Button btn;
    EditText college,date,location,complaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //fetch data
        college = findViewById(R.id.editTextTextPersonName3);
        date = findViewById(R.id.editTextTextPersonName8);
        location = findViewById(R.id.editTextTextPersonName12);
        complaint = findViewById(R.id.editTextTextPersonName11);

        btn = findViewById(R.id.button10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Fetching data
                String college1 = college.getText().toString();
                String date1 = date.getText().toString();
                String location1 = location.getText().toString();
                String complaint1 = complaint.getText().toString();
                String name = getIntent().getStringExtra("keyName");
                String surname = getIntent().getStringExtra("keySurname");
                String email = getIntent().getStringExtra("keyEmail");
                String password = getIntent().getStringExtra("keyPassword");
                String phone = getIntent().getStringExtra("keyPhone");


                Intent intent = new Intent(MainActivity5.this,MainActivity6.class);

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
            }
        });

    }
}