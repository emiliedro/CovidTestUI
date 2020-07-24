package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//SendDoctorMessage is a page in the Patient's user interface that allows the patient to send
//a message to their doctor that will be sent directly to their email
public class SendDoctorMessage extends AppCompatActivity {

    Button buttonMessageCancel, buttonMessageSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_doctor_message);

        buttonMessageCancel = (Button) findViewById(R.id.buttonMessageCancel);
        buttonMessageSubmit = (Button) findViewById(R.id.buttonMessageSubmit);

        //Tells app to use openPatientMore(), when the cancel button is clicked on
        buttonMessageCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientMore();
            }
        });

        //This is currently set to use openPatientMore() when the submit button is clicked on.
        //This can however be changed in the future to send to the message to the Doctor's email.
        buttonMessageSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientMore();
            }
        });

    }

    // Method that opens the Patient's "more" page
    public void openPatientMore(){
        Intent intent = new Intent(this, PatientMore.class);
        startActivity(intent);
    }
}