package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//AntibodyTestForm is a page in the app that allows Patients to book an antibody test. It allows
//them to choose a location on the map, a date, and a time
public class AntibodyTestForm extends AppCompatActivity {
    Button buttonAntibodyCancel, buttonAntibodySubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antibody_test_form);

        buttonAntibodyCancel = (Button) findViewById(R.id.buttonAntibodyCancel);
        buttonAntibodySubmit = (Button) findViewById(R.id.buttonAntibodySubmit);

        //Tells app to use openBookTest(), when the cancel button is clicked on
        buttonAntibodyCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBookTest();
            }
        });

        //This is currently set to use openPatientHome() when the submit button is clicked on.
        //However, this can be changed in the future to add a test to upcoming tests on both the
        //patient's user interface, and the user interface of the doctor they booked the test with
        buttonAntibodySubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientHome();
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
}