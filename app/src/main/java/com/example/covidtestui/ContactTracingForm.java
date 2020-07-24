package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//ContactTracingForm is a page on the patient's user interface that allows a patient to add the
//contact information of anyone that they have been in contact with over that past 2 weeks. The
//people they add will be contacted by email to let them know if the patient tests positive or not
public class ContactTracingForm extends AppCompatActivity {
    Button buttonContactTracingCancel, buttonContactTracingSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_tracing_form);

        buttonContactTracingCancel = (Button) findViewById(R.id.buttonContactTracingCancel);
        buttonContactTracingSubmit = (Button) findViewById(R.id.buttonContactTracingSubmit);

        //This is currently set to use openPatientMore() when the submit button is clicked on.
        //However, this can be changed in the future to add multiple contacts that will be notified
        //of any results
        buttonContactTracingSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientMore();
            }
        });

        //Tells app to use openPatientMore(), when the cancel button is clicked on
        buttonContactTracingCancel.setOnClickListener(new View.OnClickListener() {
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