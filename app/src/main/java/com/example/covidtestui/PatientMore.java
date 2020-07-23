package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientMore extends AppCompatActivity {
    Button buttonHome, buttonBookTest, buttonTestResults, buttonSymptoms, buttonMore, buttonSendMessage, buttonUpcomingTestsPatient, buttonAddContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_more);

        buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonBookTest = (Button) findViewById(R.id.buttonBookTest);
        buttonTestResults = (Button) findViewById(R.id.buttonTestResults);
        buttonSymptoms = (Button) findViewById(R.id.buttonSymptoms);
        buttonMore = (Button) findViewById(R.id.buttonMore);
        buttonAddContact = (Button) findViewById(R.id.buttonAddContact);
        buttonUpcomingTestsPatient = (Button) findViewById(R.id.buttonUpcomingTestsPatient);
        buttonSendMessage = (Button) findViewById(R.id.buttonSendMessage);

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

        buttonAddContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openContactTracingForm();
            }
        });

        buttonUpcomingTestsPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpcomingTestsPatient();
            }
        });

        buttonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openContactDoctorForm();
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

    public void openContactTracingForm(){
        Intent intent = new Intent(this, ContactTracingForm.class);
        startActivity(intent);

    }

    public void openUpcomingTestsPatient(){
        Intent intent = new Intent(this, UpcomingTestsPatient.class);
        startActivity(intent);

    }
    public void openContactDoctorForm(){
        Intent intent = new Intent(this, ContactDoctorForm.class);
        startActivity(intent);

    }
}