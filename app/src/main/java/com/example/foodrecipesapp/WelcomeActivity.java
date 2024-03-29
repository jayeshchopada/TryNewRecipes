package com.example.foodrecipesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button btnregi = findViewById(R.id.btnregi);
        TextView txtsignin = findViewById(R.id.txtsignin);

        btnregi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regi = new Intent(WelcomeActivity.this, RegistrationActivity.class);
                startActivity(regi);

            }
        });


        txtsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signin = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(signin);

            }
        });

    }
}