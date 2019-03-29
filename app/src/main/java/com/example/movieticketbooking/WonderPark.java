package com.example.movieticketbooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class WonderPark extends AppCompatActivity {

    Button button;
    String buttonText;
    Intent i;
    TextView title;
    String movie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wonderpark);
    }

    public void onClick(View v){
        title = findViewById(R.id.titletextView);
        movie = title.getText().toString();
        switch (v.getId()){
            case R.id.time1:
                button = (Button)findViewById(R.id.time1);
                buttonText = button.getText().toString();
                i = new Intent(WonderPark.this, Food_Drink.class);
                i.putExtra("time",buttonText);
                i.putExtra("title", movie);
                startActivity(i);
                break;
            case R.id.time2:
                button = (Button)findViewById(R.id.time2);
                buttonText = button.getText().toString();
                Intent i = new Intent(WonderPark.this, Food_Drink.class);
                i.putExtra("time",buttonText);
                i.putExtra("title", movie);
                startActivity(i);
                break;
            case R.id.time3:
                button = (Button)findViewById(R.id.time3);
                buttonText = button.getText().toString();
                i = new Intent(WonderPark.this, Food_Drink.class);
                i.putExtra("time",buttonText);
                i.putExtra("title", movie);
                startActivity(i);
                break;
            default:
                break;
        }
    }

}
