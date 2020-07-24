package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//AddTestResultsForm is a page on the app that allows the doctor to add test results instantly
//By simply typing the Patient's name and information about the test
public class AddTestResultsForm extends AppCompatActivity {
    Button buttonAddTestResultsSubmit, buttonAddTestResultsCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_test_results_form);

        buttonAddTestResultsCancel = (Button) findViewById(R.id.buttonAddTestResultsCancel);
        buttonAddTestResultsSubmit = (Button) findViewById(R.id.buttonAddTestResultsSubmit);

        //This is currently set to use openDoctorHome() when the submit button is clicked on.
        //However, this can be changed in the future to add test results to a patient's file
        buttonAddTestResultsSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoctorHome();
            }
        });

        //Tells app to use openDoctorHome(), when the cancel button is clicked on
        buttonAddTestResultsCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoctorHome();
            }
        });

    }

    // Method that opens the Doctor's "home" page
    public void openDoctorHome(){
        Intent intent = new Intent(this, DoctorHome.class);
        startActivity(intent);

    }
}