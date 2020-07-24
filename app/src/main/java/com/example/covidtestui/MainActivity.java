package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//MainActivity is the welcome page that appears to the user when they first open the app.
//The user than chooses whether they are a patient or a doctor. This choice will lead them to
//the appropriate user interface
public class MainActivity extends AppCompatActivity {
    Button buttonDoctorSI, buttonPatientSI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDoctorSI = (Button) findViewById(R.id.buttonDoctorSI);
        buttonPatientSI = (Button) findViewById(R.id.buttonPatientSI);

        //Tells app to use openDoctorSignIn(), when the button "Doctor" is clicked on
        buttonDoctorSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoctorSignIn();
            }
        });

        //Tells app to use openPatientSignIn(), when the button "Patient" is clicked on
        buttonPatientSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientSignIn();
            }
        });


    }

    // Method that opens the sign in page for doctors
    public void openDoctorSignIn(){
        Intent intent = new Intent(this, DoctorLogin.class);
        startActivity(intent);

    }

    // Method that opens the sign in page for patients
    public void openPatientSignIn(){
        Intent intent = new Intent(this, PatientLogin.class);
        startActivity(intent);
    }
}