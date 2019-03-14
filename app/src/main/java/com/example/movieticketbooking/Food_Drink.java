package com.example.movieticketbooking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;

public class Food_Drink extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_drinks);
        text = (TextView)findViewById(R.id.textView2);

        Intent intent2 = getIntent();

        String first = intent2.getStringExtra("time");
        text.setText(first);
    }


}
