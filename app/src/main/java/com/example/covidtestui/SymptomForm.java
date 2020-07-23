package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SymptomForm extends AppCompatActivity {
    Button buttonSymptomCancel, buttonSymptomSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom_form);

        buttonSymptomCancel = (Button) findViewById(R.id.buttonSymptomCancel);
        buttonSymptomSubmit = (Button) findViewById(R.id.buttonSymptomSubmit);

        buttonSymptomSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSymptomLog();
            }
        });

        buttonSymptomCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSymptomLog();
            }
        });

    }

    public void openSymptomLog(){
        Intent intent = new Intent(this, SymptomLog.class);
        startActivity(intent);

    }
}