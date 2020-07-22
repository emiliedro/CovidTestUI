package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientHome extends AppCompatActivity {
    Button buttonHome, buttonBookTest, buttonTestResults, buttonSymptoms, buttonMore, buttonBookNowHome, buttonViewResultsHome, buttonLogSymptomsHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_home);

        buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonBookTest = (Button) findViewById(R.id.buttonBookTest);
        buttonTestResults = (Button) findViewById(R.id.buttonTestResults);
        buttonSymptoms = (Button) findViewById(R.id.buttonSymptoms);
        buttonMore = (Button) findViewById(R.id.buttonMore);
        buttonBookNowHome = (Button) findViewById(R.id.buttonBookNowHome);
        buttonViewResultsHome = (Button) findViewById(R.id.buttonViewResultsHome);
        buttonLogSymptomsHome = (Button) findViewById(R.id.buttonLogSymptomsHome);

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

        buttonSymptoms.setOnClickListener(new View.OnClickListener() {
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

        buttonBookNowHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBookTest();
            }
        });

        buttonViewResultsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTestResults();
            }
        });

        buttonLogSymptomsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSymptomLog();
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
}