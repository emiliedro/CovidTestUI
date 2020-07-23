package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SymptomLog extends AppCompatActivity {
    Button buttonHome, buttonBookTest, buttonTestResults, buttonSymptomLog, buttonMore, buttonAddSymptomLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom_log);

        buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonBookTest = (Button) findViewById(R.id.buttonBookTest);
        buttonTestResults = (Button) findViewById(R.id.buttonTestResults);
        buttonSymptomLog = (Button) findViewById(R.id.buttonSymptomLog);
        buttonMore = (Button) findViewById(R.id.buttonMore);
        buttonAddSymptomLog = (Button) findViewById(R.id.buttonAddSymptomLog);

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientHome();
            }
        });

        buttonBookTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBookTest();
            }
        });

        buttonTestResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTestResults();
            }
        });

        buttonSymptomLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSymptomLog();
            }
        });

        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientMore();
            }
        });

        buttonAddSymptomLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSymptomForm();
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
    public void openTestResults(){
        Intent intent = new Intent(this, TestResults.class);
        startActivity(intent);

    }

    public void openSymptomLog(){
        Intent intent = new Intent(this, SymptomLog.class);
        startActivity(intent);

    }

    public void openPatientMore(){
        Intent intent = new Intent(this, PatientMore.class);
        startActivity(intent);

    }

    public void openSymptomForm(){
        Intent intent = new Intent(this, SymptomForm.class);
        startActivity(intent);

    }
}