package com.riolowry.stormy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String apiKey = "9917a75a4cc6d357d2b2f7d3a452ada0";
        double latitude = 37.8267;
        double longitude = -122.423;
        String forcastUrl = String.format("https://api.forecast.io/forecast/%s/%d,%d",apiKey,latitude,longitude);
    }
}
