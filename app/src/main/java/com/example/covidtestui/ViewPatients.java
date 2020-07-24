package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//ViewPatients is a page on the app that shows the doctor a list of their patients. It says their
//name and whether they have covid or not. The doctor can then click on view profile too see more
//information. In the future, there would be a database of patients and their would be a search
//function so that the doctor could quickly find a patient
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

        //Tells app to use openUpcomingTestsDoctor(), when the "View more" button is clicked on
        //for Jane Doe
        buttonPatientOneViewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientOne();
            }
        });

        //Tells app to use openUpcomingTestsDoctor(), when the "View more" button is clicked on
        //for John Snow
        buttonPatientTwoViewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientTwo();
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

    // Method that opens the "PatientOne" page on the doctor's user interface
    public void openPatientOne(){
        Intent intent = new Intent (this, PatientOne.class);
        startActivity(intent);

    }

    // Method that opens the "PatientTwo" page on the doctor's user interface
    public void openPatientTwo(){
        Intent intent = new Intent(this, PatientTwo.class);
        startActivity(intent);

    }
}