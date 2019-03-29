package com.example.movieticketbooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ConfirmOrder extends AppCompatActivity {

    TextView popcornSize, popcornPrice, popcornQuantity;
    TextView drinkSize, drinkPrice, drinkQuantity;
    TextView movieTitle, movieTime;
    TextView subtotal, taxes, total;

    String movieTimeIntent, drinkSizeIntent, popcornSizeIntent, drinkQuantityIntent, popcornQuantityIntent, movieTitleIntent;
    Double subTotal, tax, Total;
    Intent bundle;

    Double smallDrink, mediumDrink, largeDrink;
    Double smallPopcorn, mediumPopcorn, largePopcorn;
    Double d1, d2, d3, d4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_order);

        bundle = getIntent();

        smallDrink = 4.00;
        mediumDrink = 5.00;
        largeDrink = 7.00;

        smallPopcorn = 5.50;
        mediumPopcorn = 6.50;
        largePopcorn = 7.00;

        subtotal = findViewById(R.id.subtotal);
        taxes = findViewById(R.id.taxesCalc);
        total = findViewById(R.id.total);

        movieTimeIntent = bundle.getStringExtra("time");
        movieTitleIntent = bundle.getStringExtra("title");
        drinkSizeIntent = bundle.getStringExtra("key3");
        popcornSizeIntent = bundle.getStringExtra("key2");
        drinkQuantityIntent = bundle.getStringExtra("key5");
        popcornQuantityIntent = bundle.getStringExtra("key4");

        popcornSize = findViewById(R.id.popcornSize);
        popcornPrice = findViewById(R.id.popcornPrice);
        popcornQuantity = findViewById(R.id.popcornQuantity);

        drinkSize = findViewById(R.id.drinkSize);
        drinkPrice = findViewById(R.id.drinkPrice);
        drinkQuantity = findViewById(R.id.drinkQuantity);

        movieTitle = findViewById(R.id.movieTitle);
        movieTitle.setText(movieTitleIntent);

        movieTime = findViewById(R.id.movieTime);
        movieTime.setText(movieTimeIntent);

        if (popcornSizeIntent.equals("Small")){
            popcornSize.setText(popcornSizeIntent);
            popcornPrice.setText(smallPopcorn.toString());
            popcornQuantity.setText(popcornQuantityIntent);
        } else if (popcornSizeIntent.equals("Medium")){
            popcornSize.setText(popcornSizeIntent);
            popcornPrice.setText(mediumPopcorn.toString());
            popcornQuantity.setText(popcornQuantityIntent);
        } else if (popcornSizeIntent.equals("Large")){
            popcornSize.setText(popcornSizeIntent);
            popcornPrice.setText(largePopcorn.toString());
            popcornQuantity.setText(popcornQuantityIntent);
        }

        if (drinkSizeIntent.equals("Small")){
            drinkSize.setText(drinkSizeIntent);
            drinkPrice.setText(smallDrink.toString());
            drinkQuantity.setText(drinkQuantityIntent);
        } else if (drinkSizeIntent.equals("Medium")){
            drinkSize.setText(drinkSizeIntent);
            drinkPrice.setText(mediumDrink.toString());
            drinkQuantity.setText(drinkQuantityIntent);
        } else if (drinkSizeIntent.equals("Large")){
            drinkSize.setText(drinkSizeIntent);
            drinkPrice.setText(largeDrink.toString());
            drinkQuantity.setText(drinkQuantityIntent);
        }


        d1 = Double.parseDouble(drinkPrice.getText().toString());
        d2 = Double.parseDouble(drinkQuantity.getText().toString());

        d3 = Double.parseDouble(popcornPrice.getText().toString());
        d4 = Double.parseDouble(popcornQuantity.getText().toString());

        subTotal = (d1 * d2) + (d3 * d4);
        tax = subTotal * 0.12;
        Total = subTotal + tax;

        subtotal.setText(String.format("%.2f", subTotal));
        taxes.setText(String.format("%.2f", tax));
        total.setText(String.format("%.2f", Total));







        //Bundle extras = getIntent().getExtras();
        //if (extras != null) {
        //String value = extras.getString("key2");
        //    text.setText(value);
        //}
        //smallPopcorn.setText(pop);

    }

    public void onConfirm(View v){

    }




}
