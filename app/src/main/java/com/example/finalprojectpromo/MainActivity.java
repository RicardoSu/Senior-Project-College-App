package com.example.finalprojectpromo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;


public class MainActivity extends AppCompatActivity {

    //Main Activity Fot Login

    Button btnSignIn,btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnSignIn = findViewById(R.id.btnSignin1);

        btnRegister = findViewById(R.id.btnRegister);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIn1 = new Intent (getApplicationContext(), SignIn.class);
                startActivity(signIn1);
                finish();
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent (getApplicationContext(), Register.class);
                startActivity(register);
            }
        });
    }
}
