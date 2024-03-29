package com.example.foodrecipesapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LunchActivity extends AppCompatActivity {

    RecyclerView rcv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);


        rcv = findViewById(R.id.lunchrecview);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        String[] data = {"J","I","H","G","F","E","D","C","B","A"};
        rcv.setAdapter(new LunchAdapter(data));
    }
}