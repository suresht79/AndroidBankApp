package com.example.deepti.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationCreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_create);

        Button btnLogin = findViewById(R.id.submitButton);
        final EditText txtFirstName = findViewById(R.id.txtFirstName);
        final EditText txtLastName = findViewById(R.id.txtLastName);
        final EditText txtEmail = findViewById(R.id.txtEmail);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(getBaseContext(), RegistrationReviewActiviy.class);
                myIntent.putExtra("firstName", txtFirstName.getText().toString()); //Optional// parameters
                myIntent.putExtra("lastName", txtLastName.getText().toString()); //Optional parameters
                myIntent.putExtra("email", txtEmail.getText().toString()); //Optional parameters
                startActivity(myIntent);
            }
        });
    }

    private void initializeUIFields(){

    }
}
