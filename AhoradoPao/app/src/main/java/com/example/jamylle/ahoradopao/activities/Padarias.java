package com.example.jamylle.ahoradopao.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.jamylle.ahoradopao.R;

public class Padarias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padarias);

        final TextView textView = (TextView)findViewById(R.id.textView);

        final BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottomNav);

        bottomNav.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()) {

                            case R.id.action_places:

                                textView.setText(R.string.menu_item_places);
                                return true;

                            case R.id.action_offers:

                                textView.setText(R.string.menu_item_offers);
                                return true;

                            case R.id.action_orders:

                                textView.setText(R.string.menu_item_orders);
                                return true;

                            case R.id.action_more:

                                textView.setText(R.string.menu_item_more);
                                return true;

                            default:
                                return true;
                        }
                    }
                }
        );
    }
}
