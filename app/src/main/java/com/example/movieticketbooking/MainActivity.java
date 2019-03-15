package com.example.movieticketbooking;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Wonder(View v){
        Intent myIntent = new Intent(getBaseContext(), WonderPark.class);
        startActivity(myIntent);
    }

    public void Feet(View v){
        Intent myIntent = new Intent(getBaseContext(), FiveFeetApart.class);
        startActivity(myIntent);
    }


    public void Marvel(View v){
        Intent myIntent = new Intent(getBaseContext(), CaptainMarvel.class);
        startActivity(myIntent);
    }


    public void Dragon(View v){
        Intent myIntent = new Intent(getBaseContext(), HowToTrainYourDragon.class);
        startActivity(myIntent);
        }
}
