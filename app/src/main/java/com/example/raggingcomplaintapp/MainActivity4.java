package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity4 extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton selectedRadioButton;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //For radio buttons

        radioGroup = findViewById(R.id.radioGroup);

        //Sign up button
        btn = findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedRadioButton = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());

                Intent intent = new Intent(MainActivity4.this,MainActivity8.class);
                startActivity(intent);
            }
        });

    }
}