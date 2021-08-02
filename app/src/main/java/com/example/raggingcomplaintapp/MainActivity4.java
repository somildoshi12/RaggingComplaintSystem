package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Calendar;

public class MainActivity4 extends AppCompatActivity {

    EditText dob;
    int day,month,year;

    RadioGroup radioGroup;
    RadioButton selectedRadioButton;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        dob = findViewById(R.id.editTextTextPersonName8);
        Calendar calander = Calendar.getInstance();
        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day = calander.get(Calendar.DAY_OF_MONTH);
                month = calander.get(Calendar.MONTH);
                year = calander.get(Calendar.YEAR);

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity4.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        dob.setText(day + " / " + month + " / " + year);
                    }
                }, year, month, day);
                datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis() - 1000);
                datePickerDialog.show();
            }


        });
        //For radio buttons

        radioGroup = findViewById(R.id.radioGroup);

        //Sign up button
        btn = findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedRadioButton = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());

                Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);
            }
        });

    }
}