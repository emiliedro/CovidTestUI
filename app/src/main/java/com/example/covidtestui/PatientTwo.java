package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientTwo extends AppCompatActivity {

    Button buttonPatientBack, buttonPatientAddTestResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_two);

        buttonPatientBack = (Button) findViewById(R.id.buttonPatientBack);

        buttonPatientAddTestResults = (Button) findViewById(R.id.buttonPatientAddTestResults);

        buttonPatientBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewPatients();
            }
        });

        buttonPatientAddTestResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddSpecificTestResultsForm();
            }
        });

    }

    public void openViewPatients(){
        Intent intent = new Intent(this, ViewPatients.class);
        startActivity(intent);

    }

    public void openAddSpecificTestResultsForm(){
        Intent intent = new Intent (this, AddSpecificTestResultsForm.class);
        startActivity(intent);
    }
}