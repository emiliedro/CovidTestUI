package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//TestResults is a page in the app that presents the patient with a list of their test results.
public class TestResults extends AppCompatActivity {
    Button buttonHome, buttonBookTest, buttonTestResults, buttonSymptoms, buttonMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_results);

        buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonBookTest = (Button) findViewById(R.id.buttonBookTest);
        buttonTestResults = (Button) findViewById(R.id.buttonTestResults);
        buttonSymptoms = (Button) findViewById(R.id.buttonSymptomLog);
        buttonMore = (Button) findViewById(R.id.buttonMore);

        //Tells app to use openPatientHome(), when the "Home" button on the navigation bar is
        // clicked on
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientHome();
            }
        });

        //Tells app to use openBookTest(), when the "Book Test" button on the navigation bar is
        // clicked on
        buttonBookTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBookTest();
            }
        });

        //Tells app to use openTestResults(), when the "Test Results" button on the navigation bar
        //is clicked on
        buttonTestResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTestResults();
            }
        });

        //Tells app to use openSymptomLog(), when the "Log Symptoms" button on the navigation bar is
        // clicked on
        buttonSymptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSymptomLog();
            }
        });

        //Tells app to use openPatientMore(), when the "More" button on the navigation bar is
        // clicked on
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientMore();
            }
        });
    }

    // Method that opens the Patient's "home" page
    public void openPatientHome(){
        Intent intent = new Intent(this, PatientHome.class);
        startActivity(intent);

    }

    // Method that opens the "BookTest" page on the Patient's user interface
    public void openBookTest(){
        Intent intent = new Intent(this, BookTest.class);
        startActivity(intent);

    }

    // Method that opens the "TestResults" page on the Patient's user interface
    public void openTestResults(){
        Intent intent = new Intent(this, TestResults.class);
        startActivity(intent);

    }

    // Method that opens the "SymptomsLog" page on the Patient's user interface
    public void openSymptomLog(){
        Intent intent = new Intent(this, SymptomLog.class);
        startActivity(intent);

    }

    // Method that opens the Patient's "more" page
    public void openPatientMore(){
        Intent intent = new Intent(this, PatientMore.class);
        startActivity(intent);

    }
}