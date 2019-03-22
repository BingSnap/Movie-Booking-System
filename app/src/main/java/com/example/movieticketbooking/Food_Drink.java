package com.example.movieticketbooking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Spinner;

public class Food_Drink extends AppCompatActivity {
    TextView text;
    Intent data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_drinks);
        /*text = (TextView) findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            text.setText(value);
        }*/

        //Various drop down menus for quantity and sizes
        Spinner popcornSizeDropdown = findViewById(R.id.spinner1);
        Spinner drinkSizeDropdown = findViewById(R.id.spinner2);
        Spinner popcornQuantityDropdown = findViewById(R.id.spinner);
        Spinner drinkQuantityDropdown = findViewById(R.id.spinner3);

        String[] sizes = new String[]{"Small", "Medium", "Large"};
        String[] quantity = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};


        ArrayAdapter<String> sizeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, sizes);
        ArrayAdapter<String> quantityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, quantity);

        popcornSizeDropdown.setAdapter(sizeAdapter);
        drinkSizeDropdown.setAdapter(sizeAdapter);
        popcornQuantityDropdown.setAdapter(quantityAdapter);
        drinkQuantityDropdown.setAdapter(quantityAdapter);
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