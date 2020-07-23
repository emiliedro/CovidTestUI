package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpcomingTestsDoctor extends AppCompatActivity {
    Button buttonDoctorHome, buttonAddTestResults, buttonPatients, buttonDoctorUpcomingTests, buttonNotifs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_tests_doctor);

        buttonDoctorHome = (Button) findViewById(R.id.buttonDoctorHome);
        buttonAddTestResults = (Button) findViewById(R.id.buttonAddTestResults);
        buttonPatients = (Button) findViewById(R.id.buttonPatients);
        buttonDoctorUpcomingTests = (Button) findViewById(R.id.buttonDoctorUpcomingTests);
        buttonNotifs = (Button) findViewById(R.id.buttonNotifs);

        buttonDoctorHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoctorHome();
            }
        });

        buttonAddTestResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddTestResultsForm();
            }
        });

        buttonPatients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewPatients();
            }
        });

        buttonDoctorUpcomingTests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpcomingTestsDoctor();
            }
        });

        buttonNotifs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientNotifications();
            }
        });

    }

    public void openDoctorHome(){
        Intent intent = new Intent(this, DoctorHome.class);
        startActivity(intent);

    }

    public void openAddTestResultsForm(){
        Intent intent = new Intent(this, AddTestResultsForm.class);
        startActivity(intent);

    }

    public void openViewPatients(){
        Intent intent = new Intent(this, ViewPatients.class);
        startActivity(intent);

    }

    public void openUpcomingTestsDoctor(){
        Intent intent = new Intent(this, UpcomingTestsDoctor.class);
        startActivity(intent);

    }

    public void openPatientNotifications(){
        Intent intent = new Intent(this, PatientNotifications.class);
        startActivity(intent);

    }
}