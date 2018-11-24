package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_explore);

        // Find the View that shows the NowPlayingActivity
        Button happyButton = findViewById(R.id.button_happy);
        Button loveButton = findViewById(R.id.button_love);
        Button workButton = findViewById(R.id.button_work);
        Button kidsButton = findViewById(R.id.button_kids);
        Button partyButton = findViewById(R.id.button_party);
        Button sleepButton = findViewById(R.id.button_sleep);
        Button summerButton = findViewById(R.id.button_summer);
        Button getupButton = findViewById(R.id.button_getup);
        Button danceButton = findViewById(R.id.button_dance);

        // Set a click listener on Happy Button view
        happyButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Happy Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the NowPlayingActivity
                Intent happyButtonIntent = new Intent(ExploreActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(happyButtonIntent);
            }
        });

        // Set a click listener on Love Button view
        loveButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Love Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the NowPlayingActivity
                Intent loveButtonIntent = new Intent(ExploreActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(loveButtonIntent);
            }
        });

        // Set a click listener on Work Button view
        workButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Work Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the NowPlayingActivity
                Intent workButtonIntent = new Intent(ExploreActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(workButtonIntent);
            }
        });

        // Set a click listener on Kids Button view
        kidsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Kids Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the NowPlayingActivity
                Intent kidsButtonIntent = new Intent(ExploreActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(kidsButtonIntent);
            }
        });

        // Set a click listener on Party Button view
        partyButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Party Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the NowPlayingActivity
                Intent partyButtonIntent = new Intent(ExploreActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(partyButtonIntent);
            }
        });

        // Set a click listener on Sleep Button view
        sleepButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Sleep Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the NowPlayingActivity
                Intent sleepButtonIntent = new Intent(ExploreActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(sleepButtonIntent);
            }
        });

        // Set a click listener on Summer Button view
        summerButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Summer Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the NowPlayingActivity
                Intent summerButtonIntent = new Intent(ExploreActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(summerButtonIntent);
            }
        });

        // Set a click listener on Get Up Button view
        getupButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Get Up Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the NowPlayingActivity
                Intent getupButtonIntent = new Intent(ExploreActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(getupButtonIntent);
            }
        });

        // Set a click listener on Dance Button view
        danceButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Dance Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the NowPlayingActivity
                Intent danceButtonIntent = new Intent(ExploreActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(danceButtonIntent);
            }
        });
    }
}