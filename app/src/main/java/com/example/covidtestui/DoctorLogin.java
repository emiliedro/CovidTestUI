package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Code has been added to this file to to make buttons open the appropriate page when clicked on

//DoctorLogin is a page that allows the doctor to log in. They enter their email and password
//and are able to access the doctor's user interface by clicking sign in
public class DoctorLogin extends AppCompatActivity {

    Button buttonDoctorSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login);

        buttonDoctorSignIn = (Button) findViewById(R.id.buttonDoctorSignIn);

        //This is currently set to use openDoctorHome() when the submit button is clicked on.
        //However, this can be changed in the future to have the email and username be linked
        //to a database of users of anyone's choosing.
        buttonDoctorSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoctorHome();
            }
        });
    }

    // Method that opens the doctor's "home" page
    public void openDoctorHome(){
        Intent intent = new Intent(this, DoctorHome.class);
        startActivity(intent);

    }
}