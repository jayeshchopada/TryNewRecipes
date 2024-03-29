package com.example.foodrecipesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button btnregi = findViewById(R.id.btnregi);
        TextView txtsignin = findViewById(R.id.txtsignin);



        btnregi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        txtsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sign = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(sign);
                finish();
            }
        });

        btnregi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent regi = new Intent(RegistrationActivity.this,MainActivity.class);
               startActivity(regi);
               finish();
            }
        });
    }
}