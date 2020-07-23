package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notifications extends AppCompatActivity {

    Button buttonDoctorHome, buttonAddTestResults, buttonPatients, buttonDoctorUpcomingTests, buttonNotifs, buttonPatientOne, buttonPatientTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        buttonDoctorHome = (Button) findViewById(R.id.buttonDoctorHome);
        buttonAddTestResults = (Button) findViewById(R.id.buttonAddTestResults);
        buttonPatients = (Button) findViewById(R.id.buttonPatients);
        buttonDoctorUpcomingTests = (Button) findViewById(R.id.buttonDoctorUpcomingTests);
        buttonNotifs = (Button) findViewById(R.id.buttonNotifs);
        buttonPatientOne = (Button) findViewById(R.id.buttonPatientOne);
        buttonPatientTwo = (Button) findViewById(R.id.buttonPatientTwo);

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
                openNotifications();
            }
        });

        buttonPatientOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientOne();
            }
        });

        buttonPatientTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientTwo();
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

    public void openNotifications(){
        Intent intent = new Intent(this, Notifications.class);
        startActivity(intent);
    }

    public void openPatientOne(){
        Intent intent = new Intent(this, PatientOne.class);
        startActivity(intent);
    }

    public void openPatientTwo(){
        Intent intent = new Intent(this, PatientTwo.class);
        startActivity(intent);
    }
}