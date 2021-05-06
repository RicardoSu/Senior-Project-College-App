package com.example.finalprojectpromo;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    GridLayout mygrid;
    Animation frombottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // First code Makes the display of Icons during the fist screen

        mygrid = (GridLayout) findViewById(R.id.mygrid);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        mygrid.startAnimation(frombottom);

        // Secondly displays the bottom BottomNavigationView

//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
//
//        NavController navController = Navigation.findNavController(this, R.id.fragment);
//
//        NavigationUI.setupWithNavController(bottomNavigationView, navController);





    }
}