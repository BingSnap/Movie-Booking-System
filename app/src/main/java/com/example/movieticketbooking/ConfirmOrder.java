package com.example.movieticketbooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ConfirmOrder extends AppCompatActivity {

    TextView smallDrink, mediumDrink, largeDrink;
    TextView smallPopcorn, mediumPopcorn, largePopcorn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_order);

                //text = (TextView) findViewById(R.id.textView2);
                //text2 = (TextView) findViewById(R.id.textView6);

        //Bundle extras = getIntent().getExtras();
        //if (extras != null) {
        //String value = extras.getString("key2");
        //    text.setText(value);
        //}

        Intent i = getIntent();
        String popcornSize = i.getStringExtra("key2");
        String movieTime = i.getStringExtra("key");
        //text.setText(popcornSize);
        //text2.setText(movieTime);
    }
}
