package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientNotifications extends AppCompatActivity {

    Button buttonDoctorHome, buttonAddTestResults, buttonPatients, buttonDoctorUpcomingTests, buttonNotifs, buttonPatientOneViewProfile, buttonPatientTwoViewProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_notifications);

        buttonDoctorHome = (Button) findViewById(R.id.buttonDoctorHome);
        buttonAddTestResults = (Button) findViewById(R.id.buttonAddTestResults);
        buttonPatients = (Button) findViewById(R.id.buttonPatients);
        buttonDoctorUpcomingTests = (Button) findViewById(R.id.buttonDoctorUpcomingTests);
        buttonNotifs = (Button) findViewById(R.id.buttonNotifs);
        buttonPatientOneViewProfile = (Button) findViewById(R.id.buttonPatientOneViewMore);
        buttonPatientTwoViewProfile = (Button) findViewById(R.id.buttonPatientTwoViewMore);

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

        buttonPatientOneViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientOneInfo();
            }
        });

        buttonPatientTwoViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientTwoInfo();
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

    public void openPatientOneInfo(){
        Intent intent = new Intent(this, PatientOneInfo.class);
        startActivity(intent);

    }

    public void openPatientTwoInfo(){
        Intent intent = new Intent(this, PatientTwoInfo.class);
        startActivity(intent);

    }
}