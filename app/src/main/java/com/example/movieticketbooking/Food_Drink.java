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
    Bundle extras;
    Spinner popcornSizeDropdown, drinkSizeDropdown, popcornQuantityDropdown, drinkQuantityDropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_drinks);
        //text = (TextView) findViewById(R.id.textView2);

        extras = getIntent().getExtras();
        /*if (extras != null) {
            String value = extras.getString("key");
            text.setText(value);
        }*/

        //Various drop down menus for quantity and sizes
        popcornSizeDropdown = findViewById(R.id.spinner1);
        drinkSizeDropdown = findViewById(R.id.spinner2);
        popcornQuantityDropdown = findViewById(R.id.spinner);
        drinkQuantityDropdown = findViewById(R.id.spinner3);

        String[] sizes = new String[]{"Small", "Medium", "Large"};
        String[] quantity = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};


        ArrayAdapter<String> sizeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, sizes);
        ArrayAdapter<String> quantityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, quantity);

        popcornSizeDropdown.setAdapter(sizeAdapter);
        drinkSizeDropdown.setAdapter(sizeAdapter);
        popcornQuantityDropdown.setAdapter(quantityAdapter);
        drinkQuantityDropdown.setAdapter(quantityAdapter);
    }

    public void onClickFood(View v){

        Bundle extras = getIntent().getExtras();

        String movieTime = extras.getString("key");
        String popcornSize = popcornSizeDropdown.getSelectedItem().toString();
        String drinkSize = drinkSizeDropdown.getSelectedItem().toString();;
        String popcornQuantity = popcornQuantityDropdown.getSelectedItem().toString();;
        String drinkQuantity = drinkQuantityDropdown.getSelectedItem().toString();;

        Intent i = new Intent(Food_Drink.this, ConfirmOrder.class);
        i.putExtra("key",movieTime);
        i.putExtra("key2",popcornSize);
        i.putExtra("key3",drinkSize);
        i.putExtra("key4",popcornQuantity);
        i.putExtra("key5",drinkQuantity);
        startActivity(i);


    }

}