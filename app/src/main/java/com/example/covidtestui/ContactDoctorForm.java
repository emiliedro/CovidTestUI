package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactDoctorForm extends AppCompatActivity {

    Button buttonContactDoctorSubmit, buttonContactDoctorCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_doctor_form);

        buttonContactDoctorCancel = (Button) findViewById(R.id.buttonContactTracingCancel);
        buttonContactDoctorSubmit = (Button) findViewById(R.id.buttonContactTracingSubmit);

        buttonContactDoctorSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientMore();
            }
        });

        buttonContactDoctorCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientMore();
            }
        });
    }

    public void openPatientMore(){
        Intent intent = new Intent(this, PatientMore.class);
        startActivity(intent);

    }
}