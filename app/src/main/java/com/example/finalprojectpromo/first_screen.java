package com.example.finalprojectpromo;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Timer;
import java.util.TimerTask;

public class first_screen extends AppCompatActivity {

    // goes to second screen after few seconds
    Timer timer;

    // Variables
    ImageView mainimg;
    TextView welcomeText, descText;
    Button getStarted;
    Animation forimg, frombottom;

    private FirebaseAuth mAuth;
    private FirebaseUser mfUser;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        // Declare the variables
        mainimg = (ImageView) findViewById(R.id.mainimg);
        welcomeText = (TextView) findViewById(R.id.welcomeText);
        descText = (TextView) findViewById(R.id.descText);
        getStarted = (Button) findViewById(R.id.getStarted);

        //opens firebase

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();
        //if user created a account already it redirects to MainActivity

        if (user != null) {
            finish();
            startActivity(new Intent(first_screen.this, MainActivity.class));
        }
        //if user is new show first_screen
        else{

            // goes to second screen after few seconds
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent = new Intent(first_screen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            },5000);
        }


        //Uses buttons to transfer user from first screen to second screen
        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}