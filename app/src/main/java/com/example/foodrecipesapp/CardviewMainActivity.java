package com.example.foodrecipesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CardviewMainActivity extends AppCompatActivity {
    CardView cardViewBreakfast ,cardViewLunch ,cardViewDinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cardViewBreakfast = findViewById(R.id.cardViewBreakfast);
        cardViewLunch = findViewById(R.id.cardViewLunch);
        cardViewDinner = findViewById(R.id.cardViewDinner);


        cardViewBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bf = new Intent(CardviewMainActivity.this,BreakfastActivity.class);
                startActivity(bf);
            }
        });
    }
}