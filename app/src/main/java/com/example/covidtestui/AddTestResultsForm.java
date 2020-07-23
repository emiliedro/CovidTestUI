package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddTestResultsForm extends AppCompatActivity {
    Button buttonAddTestResultsSubmit, buttonAddTestResultsCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_test_results_form);

        buttonAddTestResultsCancel = (Button) findViewById(R.id.buttonAddTestResultsCancel);
        buttonAddTestResultsSubmit = (Button) findViewById(R.id.buttonAddTestResultsSubmit);

        buttonAddTestResultsSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoctorHome();
            }
        });

        buttonAddTestResultsCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoctorHome();
            }
        });

    }

    public void openDoctorHome(){
        Intent intent = new Intent(this, DoctorHome.class);
        startActivity(intent);

    }
}