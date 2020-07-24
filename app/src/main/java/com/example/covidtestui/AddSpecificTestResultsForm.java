package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//AddSpecificTestResultsForm is a page in the app that can be accessed by the doctor from a
//patient's profile. From here they can add information about the test and it's results
public class AddSpecificTestResultsForm extends AppCompatActivity {

    Button buttonAddSpecificTestResultsCancel, buttonAddSpecificTestResultsSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_specific_test_results_form);

        buttonAddSpecificTestResultsCancel = (Button) findViewById(R.id.buttonAddSpecificTestResultsCancel);
        buttonAddSpecificTestResultsSubmit = (Button) findViewById(R.id.buttonAddSpecificTestResultsSubmit);

        //This is currently set to use openViewPatients() when the submit button is clicked on.
        //However, this can be changed in the future to add test results to a patient's file
        buttonAddSpecificTestResultsSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewPatients();
            }
        });

        //Tells app to use openViewPatients(), when the cancel button is clicked on
        buttonAddSpecificTestResultsCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewPatients();
            }
        });
    }

    // Method that opens the "view patients" page on the Doctor's user interface
    public void openViewPatients(){
        Intent intent = new Intent(this, ViewPatients.class);
        startActivity(intent);

    }
}