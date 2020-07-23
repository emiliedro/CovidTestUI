package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AntibodyTestForm extends AppCompatActivity {
    Button buttonAntibodyCancel, buttonAntibodySubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antibody_test_form);

        buttonAntibodyCancel = (Button) findViewById(R.id.buttonAntibodyCancel);
        buttonAntibodySubmit = (Button) findViewById(R.id.buttonAntibodySubmit);

        buttonAntibodyCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBookTest();
            }
        });

        buttonAntibodySubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientHome();
            }
        });
    }

    public void openPatientHome(){
        Intent intent = new Intent(this, PatientHome.class);
        startActivity(intent);

    }

    public void openBookTest(){
        Intent intent = new Intent(this, BookTest.class);
        startActivity(intent);

    }
}