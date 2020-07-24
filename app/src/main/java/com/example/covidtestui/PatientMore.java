package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//PatientMore is a page in the app that presents the patient with more things they can do that
//weren't on the navigation bar. They can add contacts, see upcoming tests, and message their
//doctor
public class PatientMore extends AppCompatActivity {
    Button buttonHome, buttonBookTest, buttonTestResults, buttonSymptoms, buttonMore, buttonSendMessage, buttonUpcomingTestsPatient, buttonAddContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_more);

        buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonBookTest = (Button) findViewById(R.id.buttonBookTest);
        buttonTestResults = (Button) findViewById(R.id.buttonTestResults);
        buttonSymptoms = (Button) findViewById(R.id.buttonSymptomLog);
        buttonMore = (Button) findViewById(R.id.buttonMore);
        buttonAddContact = (Button) findViewById(R.id.buttonAddContact);
        buttonUpcomingTestsPatient = (Button) findViewById(R.id.buttonUpcomingTestsPatient);
        buttonSendMessage = (Button) findViewById(R.id.buttonSendMessage);

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

        //Tells app to use openContactTracingForm(), when the "Add Contact" button is clicked on
        buttonAddContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openContactTracingForm();
            }
        });

        //Tells app to use openUpcomingTestsPatient(), when the "Upcoming Tests" button is clicked
        //on
        buttonUpcomingTestsPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpcomingTestsPatient();
            }
        });

        //Tells app to use openSendDoctorMessage(), when the "Send Message" button is clicked on
        buttonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSendDoctorMessage();
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

    //Method that opens the "Contact Tracing" page on the patient's user interface
    public void openContactTracingForm(){
        Intent intent = new Intent(this, ContactTracingForm.class);
        startActivity(intent);

    }

    //Method that opens the "Upcoming Tests" page on the patient's user interface
    public void openUpcomingTestsPatient(){
        Intent intent = new Intent(this, UpcomingTestsPatient.class);
        startActivity(intent);

    }

    //Method that opens the "Contact Doctor" page on the patient's user interface
    public void openSendDoctorMessage(){
        Intent intent = new Intent(this, SendDoctorMessage.class);
        startActivity(intent);

    }
}