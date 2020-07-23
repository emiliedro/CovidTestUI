package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientTwoInfo extends AppCompatActivity {

    Button buttonPatientBack, buttonPatientAddTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_two_info);

        buttonPatientAddTest = (Button) findViewById(R.id.buttonPatientAddTest);
        buttonPatientBack = (Button) findViewById(R.id.buttonPatientBack);

        buttonPatientBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewPatients();
            }
        });

        buttonPatientAddTest.setOnClickListener(new View.OnClickListener() {
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
        Intent intent = new Intent(this, AddSpecificTestResultsForm.class);
        startActivity(intent);

    }

}