package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonDoctorSI, buttonPatientSI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDoctorSI = (Button) findViewById(R.id.buttonDoctorSI);
        buttonPatientSI = (Button) findViewById(R.id.buttonPatientSI);

        buttonDoctorSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoctorSignIn();
            }
        });

        buttonPatientSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientSignIn();
            }
        });


    }

    public void openDoctorSignIn(){
        Intent intent = new Intent(this, DoctorLogin.class);
        startActivity(intent);

    }

    public void openPatientSignIn(){
        Intent intent = new Intent(this, PatientLogin.class);
        startActivity(intent);
    }
}