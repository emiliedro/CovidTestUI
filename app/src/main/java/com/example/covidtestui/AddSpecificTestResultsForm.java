package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddSpecificTestResultsForm extends AppCompatActivity {

    Button buttonAddSpecificTestResultsCancel, buttonAddSpecificTestResultsSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_specific_test_results_form);

        buttonAddSpecificTestResultsCancel = (Button) findViewById(R.id.buttonAddSpecificTestResultsCancel);
        buttonAddSpecificTestResultsSubmit = (Button) findViewById(R.id.buttonAddSpecificTestResultsSubmit);

        buttonAddSpecificTestResultsSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewPatients();
            }
        });

        buttonAddSpecificTestResultsCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewPatients();
            }
        });
    }

    public void openViewPatients(){
        Intent intent = new Intent(this, ViewPatients.class);
        startActivity(intent);

    }
}