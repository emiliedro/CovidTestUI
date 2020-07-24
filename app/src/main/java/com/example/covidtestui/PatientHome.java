package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//PatientHome is a page in the app that presents the Patient with the main things they can do on
//the app. They can book a test, view test results, or log their symptoms.
public class PatientHome extends AppCompatActivity {
    Button buttonHome, buttonBookTest, buttonTestResults, buttonSymptomLog, buttonMore, buttonBookNowHome, buttonViewResultsHome, buttonLogSymptomsHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_home);

        buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonBookTest = (Button) findViewById(R.id.buttonBookTest);
        buttonTestResults = (Button) findViewById(R.id.buttonTestResults);
        buttonSymptomLog = (Button) findViewById(R.id.buttonSymptomLog);
        buttonMore = (Button) findViewById(R.id.buttonMore);
        buttonBookNowHome = (Button) findViewById(R.id.buttonBookNowHome);
        buttonViewResultsHome = (Button) findViewById(R.id.buttonViewResultsHome);
        buttonLogSymptomsHome = (Button) findViewById(R.id.buttonLogSymptomsHome);

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
        buttonSymptomLog.setOnClickListener(new View.OnClickListener() {
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

        //Tells app to use openBookTest(), when the "Book now" button is clicked on
        buttonBookNowHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBookTest();
            }
        });

        //Tells app to use openTestResults(), when the "View Results" button is clicked on
        buttonViewResultsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTestResults();
            }
        });

        //Tells app to use openSymptomLog(), when the "Log Symptoms" button is clicked on
        buttonLogSymptomsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSymptomLog();
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