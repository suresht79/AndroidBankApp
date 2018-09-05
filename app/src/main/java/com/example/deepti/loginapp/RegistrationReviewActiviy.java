package com.example.deepti.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationReviewActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_review_activiy);

        String firstName = getIntent().getStringExtra("firstName");

        final TextView txtFirstName = findViewById(R.id.txtFirstName);
        txtFirstName.setText(firstName);


        String lastName = getIntent().getStringExtra("lastName");

        final TextView txtLastName = findViewById(R.id.txtLastName);
        txtLastName.setText(lastName);

        String email = getIntent().getStringExtra("email");

        final TextView txtEmail = findViewById(R.id.txtEmail);
        txtEmail.setText(email);

        Button btnSubmit = findViewById(R.id.submitButton);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(getBaseContext(), RegistrationConfirmationActivity.class);
                myIntent.putExtra("firstName", txtFirstName.getText().toString()); //Optional// parameters

                startActivity(myIntent);
            }
        });
    }


}
