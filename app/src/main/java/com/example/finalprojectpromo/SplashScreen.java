package com.example.finalprojectpromo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.io.IOException;

public class SplashScreen extends AppCompatActivity {

    //variables

    private static int SPLASH_SCREEN = 5000 ;
    private static MediaPlayer mediaPlayer;

    ImageView imageSplash,imageSplash2;
    Animation topAnim,bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);


        //Animations

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom);

        //Hooks

        imageSplash = findViewById(R.id.imageViewSplash);
        imageSplash2 = findViewById(R.id.imageViewSplash2);

        imageSplash.setAnimation(topAnim);
        imageSplash2.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,first_screen.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);



        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.lion_roar2);
        //mp.setLooping(true);
        mp.start();


    }
}