package com.example.foodrecipesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button signin = findViewById(R.id.btnsignin);
        TextView regi = findViewById(R.id.txtregi);
        TextView forgotpwd = findViewById(R.id.txtforgotpwd);


        regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regi = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(regi);
                finish();
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signin = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(signin);
                finish();
            }
        });
    }
}