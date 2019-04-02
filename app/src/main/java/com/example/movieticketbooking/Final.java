package com.example.movieticketbooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;

public class Final extends AppCompatActivity {

    int random;
    TextView order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_confirm);

        order = findViewById(R.id.confirmTextView);
        random = (int)(Math.random() * 5000 + 1);
        order.setText("Your order " + "#"  + random + " has been confirmed");
    }

    public void home (View v){
        Intent i = new Intent(Final.this, MainActivity.class);
        startActivity(i);
    }
}