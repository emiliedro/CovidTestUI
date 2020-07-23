package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SendDoctorMessage extends AppCompatActivity {

    Button buttonMessageCancel, buttonMessageSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_doctor_message);

        buttonMessageCancel = (Button) findViewById(R.id.buttonMessageCancel);
        buttonMessageSubmit = (Button) findViewById(R.id.buttonMessageSubmit);

        buttonMessageCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientMore();
            }
        });

        buttonMessageSubmit.setOnClickListener(new View.OnClickListener() {
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