package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//PatientTwo is another example of what a patient's page may look like to a doctor. It is currently
//just there, however it can be linked to a database in the future, and can be automatically created
//or filled in by the doctor
public class PatientTwo extends AppCompatActivity {

    Button buttonPatientBack, buttonPatientAddTestResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_two);

        buttonPatientBack = (Button) findViewById(R.id.buttonPatientBack);

        buttonPatientAddTestResults = (Button) findViewById(R.id.buttonPatientAddTestResults);

        //Tells app to use openViewPatients(), when the back button is clicked on
        buttonPatientBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewPatients();
            }
        });

        //Tells app to use openAddSpecificTestResultsForm(), when the button "Add Test Results" is
        //clicked on
        buttonPatientAddTestResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddSpecificTestResultsForm();
            }
        });

    }

    //Method that opens the "ViewPatients" page on the doctor's user interface
    public void openViewPatients(){
        Intent intent = new Intent(this, ViewPatients.class);
        startActivity(intent);

    }

    //Method that opens the "AddSpecificTestResultsForm" page on the doctor's user interface
    public void openAddSpecificTestResultsForm(){
        Intent intent = new Intent (this, AddSpecificTestResultsForm.class);
        startActivity(intent);
    }
}