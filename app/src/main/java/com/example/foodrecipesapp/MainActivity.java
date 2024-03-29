package com.example.foodrecipesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.foodrecipesapp.Fragments.ContactUsFragment;
import com.example.foodrecipesapp.Fragments.FeedbackFragment;
import com.example.foodrecipesapp.Fragments.SettingFragment;
import com.example.foodrecipesapp.Fragments.ShareFragment;
import com.google.android.material.navigation.NavigationView;

import soup.neumorphism.NeumorphCardView;


public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    NeumorphCardView cardViewBreakfast ,cardViewLunch ,cardViewDinner;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // initialization
         drawerLayout = findViewById(R.id.drawerLayout);
         navigationView = findViewById(R.id.navigationView);
         toolbar = findViewById(R.id.toolbar);

        cardViewBreakfast = (NeumorphCardView) findViewById(R.id.cardViewBreakfast);
        cardViewLunch = (NeumorphCardView) findViewById(R.id.cardViewLunch);
        cardViewDinner = (NeumorphCardView) findViewById(R.id.cardViewDinner);


        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id ==R.id.setting){
                    loadFragment(new SettingFragment());

                } else if (id ==R.id.share) {
                    loadFragment(new ShareFragment());
                } else if (id== R.id.contactus) {
                    loadFragment(new ContactUsFragment());
                }else {
                    loadFragment(new FeedbackFragment());

                }
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;

            }
        });

        cardViewBreakfast.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Intent bf = new Intent(MainActivity.this,BreakfastActivity.class);
                startActivity(bf);
            }
        });

        cardViewLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lunch = new Intent(MainActivity.this,LunchActivity.class);
                startActivity(lunch);
            }
        });

        cardViewDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dinner = new Intent(MainActivity.this,DinnerActivity.class);
                startActivity(dinner);
            }
        });


    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }

    }


    private void loadFragment(Fragment fragment) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.container,fragment);
        ft.commit();
    }


    }


