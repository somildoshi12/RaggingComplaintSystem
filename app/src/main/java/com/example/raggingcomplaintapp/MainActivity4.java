package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton selectedRadioButton;

    Button btn;
    EditText name,surname,email,password,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //For radio buttons

        radioGroup = findViewById(R.id.radioGroup);

        //fetch data
        name = findViewById(R.id.editTextTextPersonName4);
        surname = findViewById(R.id.editTextTextPersonName5);
        email = findViewById(R.id.editTextTextPersonName6);
        password = findViewById(R.id.editTextTextPersonName7);
        phone = findViewById(R.id.editTextTextPersonName9);

        //Sign up button
        btn = findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedRadioButton = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());

                //Fetching data
                String name1 = name.getText().toString();
                String surname1 = surname.getText().toString();
                String email1 = email.getText().toString();
                String password1 = password.getText().toString();
                String phone1 = phone.getText().toString();


                Intent intent = new Intent(MainActivity4.this,MainActivity8.class);
                intent.putExtra("keyName",name1);
                intent.putExtra("keySurname",surname1);
                intent.putExtra("keyEmail",email1);
                intent.putExtra("keyPassword",password1);
                intent.putExtra("keyPhone",phone1);

                startActivity(intent);
            }
        });

    }
}