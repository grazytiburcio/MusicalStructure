package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Main2dActivity
        Button getStartedbutton = (Button) findViewById(R.id.button_getStarted);

        // Set a click listener on that View
        getStartedbutton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Get Started Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Main2Activity
                Intent getStartedIntent = new Intent(MainActivity.this, Main2Activity.class);
                // Start the new activity
                startActivity(getStartedIntent);
            }
        });
    }
}