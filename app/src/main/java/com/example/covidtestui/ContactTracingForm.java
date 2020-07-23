package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactTracingForm extends AppCompatActivity {
    Button buttonContactTracingCancel, buttonContactTracingSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_tracing_form);

        buttonContactTracingCancel = (Button) findViewById(R.id.buttonContactTracingCancel);
        buttonContactTracingSubmit = (Button) findViewById(R.id.buttonContactTracingSubmit);

        buttonContactTracingSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientMore();
            }
        });

        buttonContactTracingCancel.setOnClickListener(new View.OnClickListener() {
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