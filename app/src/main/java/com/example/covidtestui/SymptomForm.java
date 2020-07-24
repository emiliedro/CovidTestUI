package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//SymptomForm is a page on the app that allows the patient to add any symptoms they experience
//as well as add a description of their symptom
public class SymptomForm extends AppCompatActivity {
    Button buttonSymptomCancel, buttonSymptomSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom_form);

        buttonSymptomCancel = (Button) findViewById(R.id.buttonSymptomCancel);
        buttonSymptomSubmit = (Button) findViewById(R.id.buttonSymptomSubmit);

        //This is currently set to use openSymptomLog() when the submit button is clicked on.
        //However, this can be changed in the future to add symptoms to the patient's list of
        //symptoms, as well as notify the doctor of any addition
        buttonSymptomSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSymptomLog();
            }
        });

        //Tells app to use openSymptomLog(), when the cancel button is clicked on
        buttonSymptomCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSymptomLog();
            }
        });

    }

    // Method that opens the "Symptoms Log" page on the patient's user interface
    public void openSymptomLog(){
        Intent intent = new Intent(this, SymptomLog.class);
        startActivity(intent);

    }
}