package com.example.covidtestui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorLogin extends AppCompatActivity {

    Button buttonDoctorSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login);

        buttonDoctorSignIn = (Button) findViewById(R.id.buttonDoctorSignIn);

        buttonDoctorSignIn.setOnClickListener(new View.OnClickListener() {
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