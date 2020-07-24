package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//DcotorHome is a page in the app that presents the doctor with the main things they can do on
//the app. They can add test results, view their patients, and view upcoming tests
public class DoctorHome extends AppCompatActivity {

    Button buttonDoctorHome, buttonAddTestResults, buttonPatients, buttonDoctorUpcomingTests, buttonNotifs, buttonAddNowHome, buttonViewPatientsHome, buttonViewUpcomingTestsHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home);


        buttonDoctorHome = (Button) findViewById(R.id.buttonDoctorHome);
        buttonAddTestResults = (Button) findViewById(R.id.buttonAddTestResults);
        buttonPatients = (Button) findViewById(R.id.buttonPatients);
        buttonDoctorUpcomingTests = (Button) findViewById(R.id.buttonDoctorUpcomingTests);
        buttonNotifs = (Button) findViewById(R.id.buttonNotifs);
        buttonAddNowHome = (Button) findViewById(R.id.buttonAddNowHome);
        buttonViewPatientsHome = (Button) findViewById(R.id.buttonViewPatientsHome);
        buttonViewUpcomingTestsHome = (Button) findViewById(R.id.buttonViewUpcomingTestsHome);

        //Tells app to use openDoctorHome(), when the "Home" button on the navigation bar is
        // clicked on
        buttonDoctorHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoctorHome();
            }
        });

        //Tells app to use openAddTestResultsForm(), when the "Add Test Results" button on the
        //navigation bar is clicked on
        buttonAddTestResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddTestResultsForm();
            }
        });

        //Tells app to use openViewPatients(), when the "Patients" button on the
        //navigation bar is clicked on
        buttonPatients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewPatients();
            }
        });

        //Tells app to use openUpcomingTestsDoctor(), when the "Upcoming Tests" button on the
        //navigation bar is clicked on
        buttonDoctorUpcomingTests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpcomingTestsDoctor();
            }
        });

        //Tells app to use openNotifications(), when the "Notifs" button on the
        //navigation bar is clicked on
        buttonNotifs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNotifications();
            }
        });

        //Tells app to use openAddTestResultsForm(), when the "Add Now" button on the
        //navigation bar is clicked on
        buttonAddNowHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddTestResultsForm();
            }
        });

        //Tells app to use openViewPatients(), when the "View Patients" button on the
        //navigation bar is clicked on
        buttonViewPatientsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewPatients();
            }
        });

        //Tells app to use openUpcomingTestsDoctor(), when the "View Upcoming Tests" button on the
        //navigation bar is clicked on
        buttonViewUpcomingTestsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpcomingTestsDoctor();
            }
        });

    }

    // Method that opens the doctor's "home" page
    public void openDoctorHome(){
        Intent intent = new Intent(this, DoctorHome.class);
        startActivity(intent);

    }

    // Method that opens the "AddTestResults" page on the doctor's user interface
    public void openAddTestResultsForm(){
        Intent intent = new Intent(this, AddTestResultsForm.class);
        startActivity(intent);

    }

    // Method that opens the "ViewPatients" page on the doctor's user interface
    public void openViewPatients(){
        Intent intent = new Intent(this, ViewPatients.class);
        startActivity(intent);

    }

    // Method that opens the "UpcomingTestsDoctor" page on the doctor's user interface
    public void openUpcomingTestsDoctor(){
        Intent intent = new Intent(this, UpcomingTestsDoctor.class);
        startActivity(intent);

    }

    // Method that opens the "Notifications" page on the doctor's user interface
    public void openNotifications(){
        Intent intent = new Intent(this, Notifications.class);
        startActivity(intent);
    }
}