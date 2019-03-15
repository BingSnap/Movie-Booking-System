package com.example.movieticketbooking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Food_Drink extends AppCompatActivity {
    TextView text;
    Intent data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_drinks);
        //text = (TextView) findViewById(R.id.textView2);

        /*Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            text.setText(value);
        }*/
    }

    public void onClick(View v) {
        data = getIntent();
        String first = data.getExtras().getString("time");
        if (data.hasExtra("time")) {
            text.setText(first);
        } else {
            text.setText("CAT");
        }
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String first = data.getExtras().getString("time");

        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            if (data.hasExtra("time")) {
                TextView text2 = (TextView) findViewById(R.id.textView2);
                text2.setText(first);

            }
        }
    }
    */
}