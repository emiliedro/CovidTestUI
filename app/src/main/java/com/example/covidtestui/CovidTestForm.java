package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CovidTestForm extends AppCompatActivity {
    Button buttonCovidCancel, buttonCovidSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_test_form);

        buttonCovidCancel = (Button) findViewById(R.id.buttonCovidCancel);
        buttonCovidSubmit = (Button) findViewById(R.id.buttonCovidSubmit);

        buttonCovidCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBookTest();
            }
        });

        buttonCovidSubmit.setOnClickListener(new View.OnClickListener() {
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