package com.example.android.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void displayToast(View v){

        String appName = "";
        switch (v.getId()) {
            case (R.id.popularMovies):
                appName = "Popular Movies";
                break;
            case (R.id.stockHawk):
                appName = "Stock Hawk";
                break;
            case (R.id.buildItBigger):
                appName = "Build It Bigger";
                break;
            case (R.id.makeYourAppMaterial):
                appName = "Make Your App Material";
                break;
            case (R.id.goUbiquitous):
                appName = "Go Ubiquitous";
                break;
            case (R.id.capstone):
                appName = "Capstone";
                break;
        }

        Toast.makeText(getApplicationContext(), "This button will launch my " + appName + " app!", Toast.LENGTH_SHORT).show();
    }

}
