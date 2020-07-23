package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookTest extends AppCompatActivity {
    Button buttonHome, buttonBookTest, buttonTestResults, buttonSymptomLog, buttonMore, buttonBookCovidTest, buttonBookAntibodyTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_test);
        buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonBookTest = (Button) findViewById(R.id.buttonBookTest);
        buttonTestResults = (Button) findViewById(R.id.buttonTestResults);
        buttonSymptomLog = (Button) findViewById(R.id.buttonSymptomLog);
        buttonMore = (Button) findViewById(R.id.buttonMore);
        buttonBookCovidTest = (Button) findViewById(R.id.buttonBookCovidTest);
        buttonBookAntibodyTest = (Button) findViewById(R.id.buttonBookAntibodyTest);

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

        buttonBookAntibodyTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAntibodyTestForm();
            }
        });

        buttonBookCovidTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCovidTestForm();
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

    public void openCovidTestForm(){
        Intent intent = new Intent(this, CovidTestForm.class);
        startActivity(intent);

    }

    public void openAntibodyTestForm(){
        Intent intent = new Intent(this, AntibodyTestForm.class);
        startActivity(intent);

    }
}