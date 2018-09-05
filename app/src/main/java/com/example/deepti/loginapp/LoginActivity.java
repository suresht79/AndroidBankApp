package com.example.deepti.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnLogin = (Button)findViewById(R.id.submitButton);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();// Set your own toast  message
                boolean loginResult = verifyLogin();
                if(loginResult==true) {
                    Intent myIntent = new Intent(getBaseContext(), MainMenuActivity.class);
                    //myIntent.putExtra("key", "123"); //Optional parameters
                    startActivity(myIntent);
                }
                else{
                    TextView tvFailure = (TextView)findViewById(R.id.tvFailure);
                    tvFailure.setVisibility(View.VISIBLE);
                    tvFailure.setText("User login failed!!");
                    //Show failure page
                }
            }
        });
    }

    private boolean verifyLogin(){
        //call the rest service API
        //pass the username and password
        //get the success or failure response
        return  true;
    }
}
