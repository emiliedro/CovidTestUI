package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewPatients extends AppCompatActivity {

    Button buttonDoctorHome, buttonAddTestResults, buttonPatients, buttonDoctorUpcomingTests, buttonNotifs, buttonPatientOneViewMore, buttonPatientTwoViewMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_patients);

        buttonDoctorHome = (Button) findViewById(R.id.buttonDoctorHome);
        buttonAddTestResults = (Button) findViewById(R.id.buttonAddTestResults);
        buttonPatients = (Button) findViewById(R.id.buttonPatients);
        buttonDoctorUpcomingTests = (Button) findViewById(R.id.buttonDoctorUpcomingTests);
        buttonNotifs = (Button) findViewById(R.id.buttonNotifs);
        buttonPatientOneViewMore = (Button) findViewById(R.id.buttonPatientOneViewMore);
        buttonPatientTwoViewMore = (Button) findViewById(R.id.buttonPatientTwoViewMore);

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

        buttonPatientOneViewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientOne();
            }
        });

        buttonPatientTwoViewMore.setOnClickListener(new View.OnClickListener() {
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
        Intent intent = new Intent (this, PatientOne.class);
        startActivity(intent);

    }

    public void openPatientTwo(){
        Intent intent = new Intent(this, PatientTwo.class);
        startActivity(intent);

    }
}