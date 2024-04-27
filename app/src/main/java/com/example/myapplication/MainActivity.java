package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Use a Handler to delay the transition to the second activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent to start the second activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                // Close the main activity to prevent going back to it
                finish();
            }
        }, 3000);
    }
}
