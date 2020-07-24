package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//PatientLogin is a page that allows the patient to log in. They enter their email and password
//and are able to access the patient's user interface by clicking sign in
public class PatientLogin extends AppCompatActivity {
    Button buttonPatientSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_login);

        buttonPatientSignIn = (Button) findViewById(R.id.buttonPatientSignIn);

        //This is currently set to use openPatientHome() when the submit button is clicked on.
        //However, this can be changed in the future to have the email and username be linked
        //to a database of users of anyone's choosing.
        buttonPatientSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientHome();
            }
        });
    }

    // Method that opens the patient's "home" page
    public void openPatientHome(){
        Intent intent = new Intent(this, PatientHome.class);
        startActivity(intent);

    }
}