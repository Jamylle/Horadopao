package com.example.jamylle.ahoradopao.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.jamylle.ahoradopao.R;
import com.example.jamylle.ahoradopao.fragments.OffersFragment;
import com.example.jamylle.ahoradopao.fragments.OptionsFragment;
import com.example.jamylle.ahoradopao.fragments.OrdersFragment;
import com.example.jamylle.ahoradopao.fragments.PlacesFragment;

public class Padarias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padarias);

        final FragmentManager fragmentManager = getSupportFragmentManager();

        final BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottomNav);

        bottomNav.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        FragmentTransaction fragmentTransaction;

                        switch (item.getItemId()) {

                            case R.id.action_places:

                                fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.container, new PlacesFragment()).commit();
                                return true;

                            case R.id.action_offers:

                                fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.container, new OffersFragment()).commit();
                                return true;

                            case R.id.action_orders:

                                fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.container, new OrdersFragment()).commit();
                                return true;

                            case R.id.action_more:

                                fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.container, new OptionsFragment()).commit();
                                return true;

                            default:
                                return true;
                        }
                    }
                }
        );
    }
}
