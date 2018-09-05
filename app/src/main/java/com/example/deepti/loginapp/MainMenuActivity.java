package com.example.deepti.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        listView = findViewById(R.id.menuList);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Register User",
                "Show Recent Transactions",
                "Show Bills",
                "Deposit Check",
                "Show Accounts",
                "Transfer Money",
                "Spending & Budgeting",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                if(itemValue.equalsIgnoreCase("Register User")){
                    Intent myIntent = new Intent(getBaseContext(), RegistrationCreateActivity.class);
                    //myIntent.putExtra("key", "123"); //Optional parameters
                    startActivity(myIntent);
                }
                else {
                    // Show Alert
                    Toast.makeText(getApplicationContext(),
                            "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                            .show();
                }

            }

        });
    }
}
